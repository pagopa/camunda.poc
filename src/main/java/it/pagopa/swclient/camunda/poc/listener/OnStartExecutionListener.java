/*
 * OnStartExecutionListener.java
 *
 * 5 apr 2024
 */
package it.pagopa.swclient.camunda.poc.listener;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;

import io.quarkus.logging.Log;

/**
 * 
 * @author antonio.tarricone
 */
public class OnStartExecutionListener implements ExecutionListener{
	/**
	 * 
	 */
	@Override
	public void notify(DelegateExecution execution) throws Exception {
		Log.infof(">>> OnStartExecutionListener: [%s] [%s]", execution.getEventName(), execution.getActivityInstanceId());
	}
}
