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
import org.codehaus.plexus.util.FileUtils

File testPom = new File(basedir, "target/srcdeps/org.l2x6.maven.srcdeps.itest-0.0.1-SRC-revision-c60e73b94feac56501784be72e0081a37c8c01e9/pom.xml")
assert testPom.isFile()

File testJar = new File(basedir, "../../../target/local-repo/org/l2x6/maven/srcdeps/itest/srcdeps-test-artifact-api/0.0.1-SRC-revision-c60e73b94feac56501784be72e0081a37c8c01e9/srcdeps-test-artifact-api-0.0.1-SRC-revision-c60e73b94feac56501784be72e0081a37c8c01e9.jar")
assert testJar.isFile()

File logFile = new File(basedir, "build.log")
assert logFile.isFile()
String logContent = FileUtils.fileRead(logFile, "UTF-8");

assert logContent =~ /\[echo\] Hello \[random name KMYTJDb9\]!/
