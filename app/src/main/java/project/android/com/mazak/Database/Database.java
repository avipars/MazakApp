package project.android.com.mazak.Database;

/**
 * Created by Yair on 2017-02-17.
 */

public interface Database extends IGrades,IIrurs,IStats,ISchedule,ITests,INotebook {
    String username = null,password = null;
    void clearDatabase();
    String getUpdateTime(String key);
    void tryLogin() throws Exception;

    boolean isPreperation() throws Exception;
}
