/*
 * Copyright Leidos.
 */
package org.camunda.bpm.caselist.impl.web;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.camunda.bpm.engine.rest.exception.ExceptionHandler;
import org.camunda.bpm.engine.rest.exception.RestExceptionHandler;
import org.camunda.bpm.engine.rest.mapper.JacksonConfigurator;
import org.camunda.bpm.caselist.Caselist;
import org.camunda.bpm.caselist.plugin.spi.CaselistPlugin;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Issam Zeinoun
 *
 */
public class CaselistApplication extends Application {

  @Override
  public Set<Class<?>> getClasses() {
    Set<Class<?>> classes = new HashSet<Class<?>>();

    classes.add(JacksonConfigurator.class);
    classes.add(JacksonJsonProvider.class);
    classes.add(ExceptionHandler.class);
    classes.add(RestExceptionHandler.class);

    addPluginResourceClasses(classes);

    return classes;
  }

  private void addPluginResourceClasses(Set<Class<?>> classes) {

    List<CaselistPlugin> plugins = getCaselistPlugins();

    for (CaselistPlugin plugin : plugins) {
      classes.addAll(plugin.getResourceClasses());
    }
  }

  private List<CaselistPlugin> getCaselistPlugins() {
    return Caselist.getRuntimeDelegate().getAppPluginRegistry().getPlugins();
  }

}
