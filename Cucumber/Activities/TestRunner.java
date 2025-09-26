package testRunner;

import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.SelectClasspathResource;
 
import io.cucumber.junit.platform.engine.Constants;
 
@Suite//To make a class a suite
@IncludeEngines("cucumber")//convert from JUnit to cucumber
@SelectClasspathResource("Features") //Give folder name where feature file located
@ConfigurationParameter(  //Property mentions where the step definitions are located
  key = Constants.GLUE_PROPERTY_NAME,
  value = "stepDefinitions")
@ConfigurationParameter(
  key = Constants.FILTER_TAGS_PROPERTY_NAME,
  value = "@activity3")

@ConfigurationParameter(
	    key = Constants.PLUGIN_PROPERTY_NAME,
	    value = "pretty, html:Reports/HTML_Report.html, junit:Reports/XML_Report.xml, json:Reports/JSON_Report.json"
	)
@ConfigurationParameter(
	    key = Constants.PLUGIN_PUBLISH_ENABLED_PROPERTY_NAME,
	    value = "true"
	)

public class TestRunner {

}
