/*
 * Copyright Leidos
 */
package org.camunda.bpm.caselist.impl.plugin;

import org.camunda.bpm.caselist.impl.plugin.resources.CaselistPluginsRootResource;
import org.camunda.bpm.caselist.plugin.spi.impl.AbstractCaselistPlugin;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Issam Zeinoun
 */
public class CaselistPlugins extends AbstractCaselistPlugin {

  public static final String ID = "caselistPlugins";

  @Override
  public String getId() {
    return ID;
  }

  @Override
  public Set<Class<?>> getResourceClasses() {
    HashSet<Class<?>> classes = new HashSet<Class<?>>();

    classes.add(CaselistPluginsRootResource.class);

    return classes;
  }

  @Override
  public String getAssetDirectory() {
    return "plugin/caselist";
  }

}
