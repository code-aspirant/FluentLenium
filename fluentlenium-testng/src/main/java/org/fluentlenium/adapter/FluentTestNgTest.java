/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package org.fluentlenium.adapter;

import org.fluentlenium.core.FluentAdapter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * All TestNG Test should extends this class. It provides default parameters.
 */
public abstract class FluentTestNgTest extends FluentAdapter {

    @BeforeMethod
    public void beforeClass() {
        this.setDriver(getDefaultDriver());
        initTest();
    }


    public FluentTestNgTest() {
        super();
    }


    @AfterMethod
    public void afterSuite() {
        if (getDriver() != null) {
            getDriver().quit();
        }
    }


}
