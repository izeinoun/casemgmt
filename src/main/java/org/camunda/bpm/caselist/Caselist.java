/*
 * Copyright Leidos.
 */
package org.camunda.bpm.caselist;

import org.camunda.bpm.caselist.CaselistRuntimeDelegate;

/**
 * The caselist application. Provides access to the caselist core services.
 *
 * @author Issam Zeinoun
 *
 */
public class Caselist {

  /**
   * The {@link CaselistRuntimeDelegate} is an delegate that will be
   * initialized by bootstrapping camunda admin with an specific
   * instance
   */
  protected static CaselistRuntimeDelegate CASELIST_RUNTIME_DELEGATE;
  /**
   * Returns an instance of {@link CaselistRuntimeDelegate}
   *
   * @return
   */
  public static CaselistRuntimeDelegate getRuntimeDelegate() {
    return CASELIST_RUNTIME_DELEGATE;
  }

  /**
   * A setter to set the {@link CaselistRuntimeDelegate}.
   * @param caselistRuntimeDelegate
   */
  public static void setCaselistRuntimeDelegate(CaselistRuntimeDelegate caselistRuntimeDelegate) {
    CASELIST_RUNTIME_DELEGATE = caselistRuntimeDelegate;
  }

}
