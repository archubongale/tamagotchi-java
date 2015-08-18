public class Tamagotchi {
  private String mName;
  private Integer mFoodLevel;
  private Integer mSleepLevel;
  private Integer mActivityLevel;

  public Tamagotchi (String name, Integer foodLevel, Integer sleepLevel, Integer activityLevel) {

      mName = name;
      mFoodLevel = foodLevel;
      mSleepLevel= sleepLevel;
      mActivityLevel = activityLevel;
    }

    public String getName() {
      return mName;
    }

    public Integer getFoodLevel() {
      return mFoodLevel;
    }

    public Integer getSleepLevel() {
      return mSleepLevel;
    }

    public Integer getActivityLevel() {
      return mActivityLevel;
    }

    public Integer timePasses() {
      for (Integer i=1; i<=foodLevel;i++) {
      return (mFoodLevel - 1);
      Thread.sleep(60);
      }
    }
  }
