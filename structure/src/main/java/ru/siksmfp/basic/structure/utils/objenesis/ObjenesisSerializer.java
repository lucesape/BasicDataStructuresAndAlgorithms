/**
 * Copyright 2006-2017 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ru.siksmfp.basic.structure.utils.objenesis;

import ru.siksmfp.basic.structure.utils.objenesis.strategy.SerializingInstantiatorStrategy;

/**
 * Objenesis implementation using the {@link SerializingInstantiatorStrategy}.
 *
 * @author Henri Tremblay
 */
public class ObjenesisSerializer extends ObjenesisBase {

   /**
    * Default constructor using the {@link org.objenesis.strategy.SerializingInstantiatorStrategy}
    */
   public ObjenesisSerializer() {
      super(new SerializingInstantiatorStrategy());
   }

   /**
    * Instance using the {@link org.objenesis.strategy.SerializingInstantiatorStrategy} with or without caching
    * {@link org.objenesis.instantiator.ObjectInstantiator}s
    *
    * @param useCache If {@link org.objenesis.instantiator.ObjectInstantiator}s should be cached
    */
   public ObjenesisSerializer(boolean useCache) {
      super(new SerializingInstantiatorStrategy(), useCache);
   }
}
