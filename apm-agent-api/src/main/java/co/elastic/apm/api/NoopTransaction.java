/*-
 * #%L
 * Elastic APM Java agent
 * %%
 * Copyright (C) 2018 - 2019 Elastic and contributors
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package co.elastic.apm.api;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

enum NoopTransaction implements Transaction {

    INSTANCE;

    @Nonnull
    @Override
    public Transaction setName(String name) {
        // noop
        return this;
    }

    @Nonnull
    @Override
    public Transaction setType(String type) {
        // noop
        return this;
    }

    @Nonnull
    @Override
    public Transaction addTag(String key, String value) {
        // noop
        return this;
    }

    @Nonnull
    @Override
    public Transaction addLabel(String key, String value) {
        return this;
    }

    @Nonnull
    @Override
    public Transaction addLabel(String key, Number value) {
        return this;
    }

    @Nonnull
    @Override
    public Transaction addLabel(String key, boolean value) {
        return this;
    }

    @Override
    public Transaction setUser(String id, String email, String username) {
        // noop
        return this;
    }

    @Override
    public Transaction setResult(String result) {
        // noop
        return this;
    }

    @Override
    public void end() {
        // noop
    }

    @Override
    public void captureException(Throwable throwable) {
        // co.elastic.apm.agent.plugin.api.CaptureExceptionInstrumentation
    }

    @Nonnull
    @Override
    public String getId() {
        return "";
    }

    @Nonnull
    @Override
    public String ensureParentId() {
        return "";
    }

    @Nonnull
    @Override
    public String getTraceId() {
        return "";
    }

    @Override
    public Scope activate() {
        return NoopScope.INSTANCE;
    }

    @Override
    public boolean isSampled() {
        return false;
    }

    @Nonnull
    @Override
    public Span createSpan() {
        return NoopSpan.INSTANCE;
    }

    @Nonnull
    @Override
    public Span startSpan(String type, @Nullable String subtype, @Nullable String action) {
        return NoopSpan.INSTANCE;
    }

    @Nonnull
    @Override
    public Span startSpan() {
        return NoopSpan.INSTANCE;
    }


    @Override
    public void injectTraceHeaders(HeaderInjector headerInjector) {
        // noop
    }
}
