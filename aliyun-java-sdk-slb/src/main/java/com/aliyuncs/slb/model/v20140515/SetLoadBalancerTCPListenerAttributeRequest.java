/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.slb.model.v20140515;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SetLoadBalancerTCPListenerAttributeRequest extends RpcAcsRequest<SetLoadBalancerTCPListenerAttributeResponse> {
	
	public SetLoadBalancerTCPListenerAttributeRequest() {
		super("Slb", "2014-05-15", "SetLoadBalancerTCPListenerAttribute");
	}

	private Long ownerId;

	private String resourceOwnerAccount;

	private Long resourceOwnerId;

	private String loadBalancerId;

	private Integer listenerPort;

	private Integer bandwidth;

	private String scheduler;

	private Integer persistenceTimeout;

	private Integer healthyThreshold;

	private Integer unhealthyThreshold;

	private Integer healthCheckConnectTimeout;

	private Integer healthCheckConnectPort;

	private Integer healthCheckInterval;

	private String healthCheckDomain;

	private String healthCheckURI;

	private String healthCheckHttpCode;

	private String synProxy;

	private String ownerAccount;

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		putQueryParameter("OwnerId", String.valueOf(ownerId));
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		putQueryParameter("ResourceOwnerId", String.valueOf(resourceOwnerId));
	}

	public String getLoadBalancerId() {
		return this.loadBalancerId;
	}

	public void setLoadBalancerId(String loadBalancerId) {
		this.loadBalancerId = loadBalancerId;
		putQueryParameter("LoadBalancerId", loadBalancerId);
	}

	public Integer getListenerPort() {
		return this.listenerPort;
	}

	public void setListenerPort(Integer listenerPort) {
		this.listenerPort = listenerPort;
		putQueryParameter("ListenerPort", String.valueOf(listenerPort));
	}

	public Integer getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(Integer bandwidth) {
		this.bandwidth = bandwidth;
		putQueryParameter("Bandwidth", String.valueOf(bandwidth));
	}

	public String getScheduler() {
		return this.scheduler;
	}

	public void setScheduler(String scheduler) {
		this.scheduler = scheduler;
		putQueryParameter("Scheduler", scheduler);
	}

	public Integer getPersistenceTimeout() {
		return this.persistenceTimeout;
	}

	public void setPersistenceTimeout(Integer persistenceTimeout) {
		this.persistenceTimeout = persistenceTimeout;
		putQueryParameter("PersistenceTimeout", String.valueOf(persistenceTimeout));
	}

	public Integer getHealthyThreshold() {
		return this.healthyThreshold;
	}

	public void setHealthyThreshold(Integer healthyThreshold) {
		this.healthyThreshold = healthyThreshold;
		putQueryParameter("HealthyThreshold", String.valueOf(healthyThreshold));
	}

	public Integer getUnhealthyThreshold() {
		return this.unhealthyThreshold;
	}

	public void setUnhealthyThreshold(Integer unhealthyThreshold) {
		this.unhealthyThreshold = unhealthyThreshold;
		putQueryParameter("UnhealthyThreshold", String.valueOf(unhealthyThreshold));
	}

	public Integer getHealthCheckConnectTimeout() {
		return this.healthCheckConnectTimeout;
	}

	public void setHealthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
		this.healthCheckConnectTimeout = healthCheckConnectTimeout;
		putQueryParameter("HealthCheckConnectTimeout", String.valueOf(healthCheckConnectTimeout));
	}

	public Integer getHealthCheckConnectPort() {
		return this.healthCheckConnectPort;
	}

	public void setHealthCheckConnectPort(Integer healthCheckConnectPort) {
		this.healthCheckConnectPort = healthCheckConnectPort;
		putQueryParameter("HealthCheckConnectPort", String.valueOf(healthCheckConnectPort));
	}

	public Integer getHealthCheckInterval() {
		return this.healthCheckInterval;
	}

	public void setHealthCheckInterval(Integer healthCheckInterval) {
		this.healthCheckInterval = healthCheckInterval;
		putQueryParameter("HealthCheckInterval", String.valueOf(healthCheckInterval));
	}

	public String getHealthCheckDomain() {
		return this.healthCheckDomain;
	}

	public void setHealthCheckDomain(String healthCheckDomain) {
		this.healthCheckDomain = healthCheckDomain;
		putQueryParameter("HealthCheckDomain", healthCheckDomain);
	}

	public String getHealthCheckURI() {
		return this.healthCheckURI;
	}

	public void setHealthCheckURI(String healthCheckURI) {
		this.healthCheckURI = healthCheckURI;
		putQueryParameter("HealthCheckURI", healthCheckURI);
	}

	public String getHealthCheckHttpCode() {
		return this.healthCheckHttpCode;
	}

	public void setHealthCheckHttpCode(String healthCheckHttpCode) {
		this.healthCheckHttpCode = healthCheckHttpCode;
		putQueryParameter("HealthCheckHttpCode", healthCheckHttpCode);
	}

	public String getSynProxy() {
		return this.synProxy;
	}

	public void setSynProxy(String synProxy) {
		this.synProxy = synProxy;
		putQueryParameter("SynProxy", synProxy);
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		putQueryParameter("OwnerAccount", ownerAccount);
	}

	@Override
	public Class<SetLoadBalancerTCPListenerAttributeResponse> getResponseClass() {
		return SetLoadBalancerTCPListenerAttributeResponse.class;
	}

}
