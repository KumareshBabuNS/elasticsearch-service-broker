/**
 * Copyright (C) 2017-Present Pivotal Software, Inc. All rights reserved.
 * <p>
 * This program and the accompanying materials are made available under
 * the terms of the under the Apache License, Version 2.0 (the "License”);
 * you may not use this file except in compliance with the License.
 * <p>
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * <p>
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.pivotal.cf.broker.es;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.servicebroker.exception.ServiceBrokerException;

@Slf4j
public class ElasticSearchBrokerException extends ServiceBrokerException {

    public ElasticSearchBrokerException(String message, Throwable cause) {
        super(message, cause);
        log.error(message, cause);
    }

    public ElasticSearchBrokerException(Throwable cause) {
        this(cause.getMessage(), cause);

    }
}
