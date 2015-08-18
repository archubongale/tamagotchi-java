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

      Integer mFoodLevel=10;

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

    // public Integer timePasses(Integer getFoodLevel) {
    //   for (Integer i=1; i<=getFoodLevel; i++) {
    //   return (getFoodLevel - 1);
    //   try {
    //   Thread.sleep(60);
    // }
  //   }
  // }


    public boolean isAlive() {
      if ( mFoodLevel > 0 ) {
        return true;
      }
      else {
        return false;
      }
    }

    public Integer addFood() {
      return mFoodLevel + 1;
    }

    public Integer addSleep() {
      return mSleepLevel + 1;
    }

    public Integer addActivity() {
      return mActivityLevel + 1;
    }
  }
