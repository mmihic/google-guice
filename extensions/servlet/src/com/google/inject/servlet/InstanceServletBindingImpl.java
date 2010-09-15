/**
 * Copyright (C) 2010 Google Inc.
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

package com.google.inject.servlet;

import java.util.Map;

import javax.servlet.http.HttpServlet;

/**
 * Default implementation of InstanceServletBinding.
 * 
 * @author sameb@google.com (Sam Berlin)
 */
class InstanceServletBindingImpl extends AbstractServletModuleBinding<HttpServlet> implements
    InstanceServletBinding {

  InstanceServletBindingImpl(Map<String, String> initParams, String pattern,
      HttpServlet target, UriPatternType patternType) {
    super(initParams, pattern, target, patternType);
  }

  public HttpServlet getServletInstance() {
    return getTarget();
  }

}