/**
 * Copyright (c) 2014 Lemur Consulting Ltd.
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.co.flax.biosolr.ontology.config;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Configuration details specific to Apache Jena.
 * 
 * @author Matt Pearce
 */
public class JenaConfiguration {
	
	@JsonProperty("ontologyUri")
	private String ontologyUri;
	
	@JsonProperty("tdbPath")
	private String tdbPath = null;

	/**
	 * @return the ontologyUri
	 */
	public String getOntologyUri() {
		return ontologyUri;
	}
	
	public String getTdbPath() {
		return tdbPath;
	}

}
