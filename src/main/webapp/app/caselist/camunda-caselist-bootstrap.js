/*
 * Copyright Camunda Services GmbH and/or licensed to Camunda Services GmbH
 * under one or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information regarding copyright
 * ownership. Camunda licenses this file to you under the Apache License,
 * Version 2.0; you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

window._import=e=>import(e);const baseImportPath=document.querySelector("base").href+"../",loadConfig=async function(){const e=(await import(baseImportPath+"scripts/config.js?bust="+(new Date).getTime())).default||{};return window.camCaselistConf=e,e}();window.__define("camunda-caselist-bootstrap",["./scripts/camunda-caselist-ui"],(function(){loadConfig.then((e=>{!function(e){"use strict";var i=window.CamundacaselistUi;requirejs.config({baseUrl:"../../../lib"});var n=window;i.exposePackages(n),window.define=window.__define,window.require=window.__require,requirejs(["globalize"],(function(a){a(requirejs,["angular","camunda-commons-ui","camunda-bpm-sdk-js","jquery","angular-data-depend"],n);var t=window.PLUGIN_PACKAGES||[],s=window.PLUGIN_DEPENDENCIES||[];t=t.filter((e=>"caselist-plugin-caselistPlugins"===e.name||e.name.startsWith("caselist-plugin-legacy"))),s=s.filter((e=>"caselist-plugin-caselistPlugins"===e.requirePackageName||e.requirePackageName.startsWith("caselist-plugin-legacy"))),t.forEach((function(e){var i=document.createElement("link");i.setAttribute("rel","stylesheet"),i.setAttribute("href",e.location+"/plugin.css"),document.head.appendChild(i)})),requirejs.config({packages:t,baseUrl:"../",paths:{ngDefine:"../../lib/ngDefine"}});var o=["angular","ngDefine"].concat(s.map((function(e){return e.requirePackageName})));requirejs(o,(function(n){if(window.camcaselistConf&&window.camcaselistConf.csrfCookieName&&n.module("cam.commons").config(["$httpProvider",function(e){e.defaults.xsrfCookieName=window.camcaselistConf.csrfCookieName}]),void 0!==window.camcaselistConf&&window.camcaselistConf.requireJsConfig){var a=e.requireJsConfig||{},t={};["baseUrl","paths","bundles","shim","map","config","packages","waitSeconds","context","callback","enforceDefine","xhtml","urlArgs","scriptType"].forEach((function(e){a[e]&&(t[e]=a[e])})),requirejs.config(t),requirejs(a.deps||[],(function(){n.module("cam.caselist.custom",a.ngDeps),window.define=void 0,window.require=void 0,i(s)}))}else n.module("cam.caselist.custom",[]),require([],(function(){window.define=void 0,window.require=void 0,i(s)}))}))}))}(e)}))})),requirejs(["camunda-caselist-bootstrap"],(function(){}));