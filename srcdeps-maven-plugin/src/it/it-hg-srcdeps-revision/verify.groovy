/**
 * Copyright 2015 Maven Source Dependencies
 * Plugin contributors as indicated by the @author tags.
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
 */
File testPom = new File(basedir, "../../../target/dependency-sources/org.l2x6.maven.srcdeps.itest.hg/pom.xml")
assert testPom.isFile()

File testJar = new File(basedir, "../../../target/local-repo/org/l2x6/maven/srcdeps/itest/hg/srcdeps-test-artifact-hg/0.0.1-SRC-revision-0/srcdeps-test-artifact-hg-0.0.1-SRC-revision-0.jar")
assert testJar.isFile()