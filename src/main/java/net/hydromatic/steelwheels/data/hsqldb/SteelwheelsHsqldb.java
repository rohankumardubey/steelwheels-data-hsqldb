/*
 * Licensed to Julian Hyde under one or more contributor license
 * agreements.  See the NOTICE file distributed with this work for
 * additional information regarding copyright ownership. Julian Hyde
 * licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.hydromatic.steelwheels.data.hsqldb;

/** Steelwheels data set in hsqldb format.
 *
 * <p>If you log in using {@link #USER} and {@link #PASSWORD}, the session's
 * initial schema will be "steelwheels". You can also log in using user = "sa",
 * password = "", but the initial schema will be "PUBLIC" (hsqldb's default
 * initial schema).
 */
public class SteelwheelsHsqldb {
  /** URI of the hsqldb database. */
  public static final String URI = "jdbc:hsqldb:res:steelwheels";
  public static final String USER = "STEELWHEELS";
  public static final String PASSWORD = "STEELWHEELS";
  public static final String SCHEMA = "steelwheels";
}

// End SteelwheelsHsqldb.java
