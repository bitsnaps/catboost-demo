package demo;

import ai.catboost.CatBoostModel;
import ai.catboost.CatBoostPredictions;

public class App {

  public static void main(String[] args) throws Exception {
    CatBoostModel model = CatBoostModel.loadModel("src/resources/model.cbm");
    CatBoostPredictions prediction = model.predict(new float[]{0.1f, 0.3f, 0.2f}, new String[]{"foo", "bar", "baz"});
    // assuming that this is a regression task
    System.out.print("model value is " + String.valueOf(prediction.get(0, 0)));

  }

}

