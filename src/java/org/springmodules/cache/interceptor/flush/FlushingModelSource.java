/* 
 * Created on Oct 3, 2005
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
 *
 * Copyright @2005 the original author or authors.
 */
package org.springmodules.cache.interceptor.flush;

import java.lang.reflect.Method;

import org.springmodules.cache.FlushingModel;

/**
 * <p>
 * Returns an instance of <code>{@link FlushingModel}</code> from the
 * intercepted method.
 * </p>
 * 
 * @author Alex Ruiz
 * 
 * @version $Revision$ $Date$
 */
public interface FlushingModelSource {

  /**
   * Returns an instance of <code>{@link FlushingModel}</code> for the
   * intercepted method.
   * 
   * @param method
   *          the definition of the intercepted method.
   * @param targetClass
   *          the target class. May be <code>null</code>, in which case the
   *          declaring class of the method must be used.
   * @return a cache-flushing model from the intercepted method.
   */
  FlushingModel getFlushingModel(Method method, Class targetClass);
}