import java.util.Map;
import java.util.HashMap;
import java.util.Random;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String,Object>();
      model.put("name", request.session().attribute("name"));

      model.put("template", "templates/home.vtl");

      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/name", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      String name = request.queryParams("name");
      request.session().attribute("name", name);
      // String foodLevelInput = request.queryParams("foodLevel");
      // String activityLevelInput = request.queryParams("activityLevel");
      // String sleepLevelInput = request.queryParams("sleepLevel");
      //
      // Integer foodLevel = Integer.parseInt(foodLevelInput);
      // Integer activityLevel = Integer.parseInt(activityLevelInput);
      // Integer sleepLevel = Integer.parseInt(sleepLevelInput);

      Tamagotchi myTamagotchi = new Tamagotchi(name,10,10,10);
      //, foodLevel, activityLevel, sleepLevel
      // Integer getInitalFoodLevel = myTamagotchi.getFoodLevel();

      model.put("name", name);
      //model.put("name", request.session().attribute("name"));

      // model.put("foodlevel", foodLevel);
      // model.put("sleeplevel", sleepLevel);
      // model.put("activitylevel", activityLevel);
      // model.put("getInitalFoodLevel", getInitalFoodLevel);

      model.put("template", "templates/tamagotchi.vtl");
      return new ModelAndView(model, layout);


    }, new VelocityTemplateEngine());
  }

  //Algorithm goes here
}
