/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.googlecode.wicket.jquery.ui.widget.tabs;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.extensions.markup.html.tabs.ITab;

/**
 * Event listener shared by the {@link TabbedPanel} widget and the {@link TabsBehavior}
 *
 * @author Sebastien Briquet - sebfz1
 *
 */
interface ITabsListener
{
	/**
	 * Indicates whether the 'beforeActivate' event is enabled.<br />
	 * If true, the {@link #onActivating(AjaxRequestTarget, int, ITab)} event will be triggered.
	 *
	 * @return false by default
	 */
	boolean isOnActivatingEventEnabled();

	/**
	 * Triggered when a tab is being activated ('beforeActivate' event).<br/>
	 *
	 * @param target the {@link AjaxRequestTarget}
	 * @param index the previously selected tab index
	 * @param tab the {@link ITab} that corresponds to the index
	 */
	void onActivating(AjaxRequestTarget target, int index, ITab tab);

	/**
	 * Triggered when a tab has been activated ('activate' event).<br/>
	 *
	 * @param target the {@link AjaxRequestTarget}
	 * @param index the tab index that triggered this event
	 * @param tab the {@link ITab} that corresponds to the index
	 */
	void onActivate(AjaxRequestTarget target, int index, ITab tab);
}
