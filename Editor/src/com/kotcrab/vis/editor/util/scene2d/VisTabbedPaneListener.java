/*
 * Copyright 2014-2016 See AUTHORS file.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.kotcrab.vis.editor.util.scene2d;

import com.kotcrab.vis.ui.widget.tabbedpane.Tab;
import com.kotcrab.vis.ui.widget.tabbedpane.TabbedPaneListener;

/**
 * Java 8 default implementation of {@link TabbedPaneListener} Aka. TabbedPaneAdapter
 * @author Kotcrab
 */
public interface VisTabbedPaneListener extends TabbedPaneListener {
	@Override
	default void switchedTab (Tab tab) {

	}

	@Override
	default void removedTab (Tab tab) {

	}

	@Override
	default void removedAllTabs () {

	}
}
