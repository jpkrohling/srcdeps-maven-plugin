/**
 * Copyright 2015-2016 Maven Source Dependencies
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

File testPom = new File(basedir, "target/srcdeps/org.l2x6.maven.srcdeps.itest-0.0.1-SRC-revision-56576301d21c53439bcb5c48502c723282633cc7/pom.xml")
assert testPom.isFile()

File testJar = new File(basedir, "../../../target/local-repo/org/l2x6/maven/srcdeps/itest/srcdeps-test-artifact-service/0.0.1-SRC-revision-56576301d21c53439bcb5c48502c723282633cc7/srcdeps-test-artifact-service-0.0.1-SRC-revision-56576301d21c53439bcb5c48502c723282633cc7.jar")
assert testJar.isFile()
