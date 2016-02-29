package com.postmark.java.client;



import com.postmark.java.client.server.PostmarkServerClient;
import com.postmark.java.exception.PostmarkException;
import com.postmark.java.model.Server;

import java.util.List;

/**
 * Created by Saurabh Sejpal on Feb 21 2016.
 */
public class PostmarkServerClientTest {

    public static void main(String[] args) throws PostmarkException {
        PostmarkServerClient postmarkServerClient = new PostmarkServerClient();
        /* Getting All Server List */
        getAllServers(postmarkServerClient);

        /* Get a Server using Server Id */
        long serverId   =   1680960;
        getServer(postmarkServerClient, serverId);

    }

    public static  void getAllServers(PostmarkServerClient postmarkServerClient) throws PostmarkException {
        try {
            List<Server> serverList = postmarkServerClient.getServers();
            if (null != serverList) {
                for (Server server : serverList) {
                    System.out.println(server.toString());
                }
            }
        } catch (PostmarkException postmarkException) {
            postmarkException.printStackTrace();
        }
    }

    public static void getServer(PostmarkServerClient postmarkServerClient, long serverId) throws PostmarkException {
        try {
            Server server = postmarkServerClient.getServer(serverId);
            System.out.println(server.toString());
        } catch (PostmarkException postmarkException) {
            postmarkException.printStackTrace();
        }
    }

    public static void createServer(PostmarkServerClient postmarkServerClient, Server server) throws PostmarkException {
        System.out.println(postmarkServerClient.createServer(server).toString());

    }

    public static void editServer(PostmarkServerClient postmarkServerClient, Server server) throws PostmarkException {
        System.out.println(postmarkServerClient.editServer(server).toString());
    }

    public static void deleteServer(PostmarkServerClient postmarkServerClient, long serverId) throws PostmarkException {
        System.out.println(postmarkServerClient.deleteServer(serverId).toString());
    }

}
