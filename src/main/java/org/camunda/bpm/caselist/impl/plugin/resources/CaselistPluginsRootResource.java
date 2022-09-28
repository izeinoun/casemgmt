/*
 * Copyright Leidos.
 */
package org.camunda.bpm.caselist.impl.plugin.resources;

import org.camunda.bpm.caselist.impl.plugin.CaselistPlugins;
import org.camunda.bpm.caselist.resource.AbstractCaselistPluginRootResource;

import javax.ws.rs.Path;

/**
 * @author Issam Zeinoun
 *
 */
@Path("plugin/" + CaselistPlugins.ID)
public class CaselistPluginsRootResource extends AbstractCaselistPluginRootResource {

  public CaselistPluginsRootResource() {
    super(CaselistPlugins.ID);
  }

}
