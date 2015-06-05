/*
 * Copyright 2011 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.jstestdriver.hooks;

import com.google.jstestdriver.BrowserInfo;

/**
 * Defines the events that happen during the JsTestdriverServer lifecycle.
 * @author corysmith@google.com (Cory Smith)
 *
 */
public interface ServerListener {
  /**
   * Called when the server starts up.
   */
  public void serverStarted();

  /**
   * Called when the server stops.
   */
  public void serverStopped();

  /**
   * Called when a new browser is captured.
   * @param info The information about the new browser.
   */
  public void browserCaptured(BrowserInfo info);

  /**
   * Called when a browser "panics" or become inaccessible to the runner.
   * @param info The information about the lost browser.
   */
  public void browserPanicked(BrowserInfo info);
}