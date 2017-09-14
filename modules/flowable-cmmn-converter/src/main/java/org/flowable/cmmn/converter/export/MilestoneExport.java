/* Licensed under the Apache License, Version 2.0 (the "License");
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
 */
package org.flowable.cmmn.converter.export;

import javax.xml.stream.XMLStreamWriter;

import org.flowable.cmmn.model.Milestone;

public class MilestoneExport extends AbstractPlanItemDefinitionExport {
    
    public static void writeMilestone(Milestone milestone, XMLStreamWriter xtw) throws Exception {
        // start milestone element
        xtw.writeStartElement(ELEMENT_MILESTONE);
        writeCommonPlanItemDefinitionAttributes(milestone, xtw);
        
        // end task element
        xtw.writeEndElement();
    }
}