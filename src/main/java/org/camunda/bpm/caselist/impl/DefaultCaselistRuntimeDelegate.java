package org.camunda.bpm.caselist.impl;

import org.camunda.bpm.caselist.CaselistRuntimeDelegate;
import org.camunda.bpm.caselist.plugin.spi.CaselistPlugin;
import org.camunda.bpm.webapp.impl.AbstractAppRuntimeDelegate;

/**
 * @author Issam Zeinoun
 *
 */
public class DefaultCaselistRuntimeDelegate extends AbstractAppRuntimeDelegate<CaselistPlugin> implements CaselistRuntimeDelegate {

  public DefaultCaselistRuntimeDelegate() {
    super(CaselistPlugin.class);
  }

}