/**
 * Copyright 2017, Radiant Solutions
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **/
package org.venice.piazza.idam.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GxOAuthTokenResponse {

	private int expiresIn;
	private String tokenType;
	private String accessToken;

	public int getExpiresIn() {
		return expiresIn;
	}

	@JsonSetter("expires_in")
	public void setExpiresIn(int expiresIn) {
		this.expiresIn = expiresIn;
	}

	public String getTokenType() {
		return tokenType;
	}

	@JsonSetter("token_type")
	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}

	public String getAccessToken() {
		return accessToken;
	}

	@JsonSetter("access_token")
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

    @Override
    public String toString() {
        return "GxOAuthTokenResponse{" +
                "expiresIn='" + expiresIn + '\'' +
                ", tokenType='" + tokenType + '\'' +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}
