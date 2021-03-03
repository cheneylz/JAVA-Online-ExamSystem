package cn.com.yijuan.service;


import cn.com.yijuan.domain.User;

/**
 * @author CheneyL
 * 认证服务
 */
public interface AuthenticationService {

    /**
     * authUser
     *
     * @param username username
     * @param password password
     * @return boolean
     */
    boolean authUser(String username, String password);



    /**
     * authUser
     *
     * @param user     user
     * @param username username
     * @param password password
     * @return boolean
     */
    boolean authUser(User user, String username, String password);

    /**
     * pwdEncode
     *
     * @param password password
     * @return String
     */
    String pwdEncode(String password);

    /**
     * pwdDecode
     *
     * @param endodePwd endodePwd
     * @return String
     */
    String pwdDecode(String endodePwd);
}
