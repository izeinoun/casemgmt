/*
 * Copyright Leidos.
 */
package org.camunda.bpm.caselist.impl.web.bootstrap;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.camunda.bpm.container.RuntimeContainerDelegate;
import org.camunda.bpm.engine.rest.util.WebApplicationUtil;
import org.camunda.bpm.caselist.Caselist;
import org.camunda.bpm.caselist.impl.DefaultCaselistRuntimeDelegate;

/**
 * @author Issam Zeinoun
 *
 */
public class CaselistContainerBootstrap implements ServletContextListener {

    protected CaselistEnvironment environment;

    @Override
    public void contextInitialized(ServletContextEvent sce) {

        environment = createCaselistEnvironment();
        environment.setup();

        WebApplicationUtil.setApplicationServer(sce.getServletContext().getServerInfo());

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

        environment.tearDown();
    }

    protected CaselistEnvironment createCaselistEnvironment() {
        return new CaselistEnvironment();
    }

    protected static class CaselistEnvironment {

        public void tearDown() {
            Caselist.setCaselistRuntimeDelegate(null);
        }

        public void setup() {
            Caselist.setCaselistRuntimeDelegate(new DefaultCaselistRuntimeDelegate());
        }

        protected RuntimeContainerDelegate getContainerRuntimeDelegate() {
            return RuntimeContainerDelegate.INSTANCE.get();
        }
    }

}
