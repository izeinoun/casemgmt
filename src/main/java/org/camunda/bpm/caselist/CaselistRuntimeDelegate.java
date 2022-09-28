/*
 * Copyright Leidos.
 */

package org.camunda.bpm.caselist;

import org.camunda.bpm.caselist.plugin.spi.CaselistPlugin;
import org.camunda.bpm.webapp.AppRuntimeDelegate;

/**
 * The caselist application service runtime delegate. Provides access to the
 * application services of the caselist application.
 *
 * @author Issam Zeinoun
 *
 */
public interface CaselistRuntimeDelegate extends AppRuntimeDelegate<CaselistPlugin> {

}
