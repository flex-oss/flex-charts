package org.cdlflex.charts;

import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.wicket.util.time.Duration;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.bio.SocketConnector;
import org.eclipse.jetty.webapp.WebAppContext;

public class Start {

    private static final int PORT = 8080;
    private static final String WAR_PATH = "src/main/webapp";

    public static void main(String[] args) throws Exception {
        int timeout = (int) Duration.ONE_HOUR.getMilliseconds();

        Server server = new Server();
        SocketConnector connector = new SocketConnector();

        // Set some timeout options to make debugging easier.
        connector.setMaxIdleTime(timeout);
        connector.setSoLingerTime(-1);
        connector.setPort(PORT);
        server.addConnector(connector);

        WebAppContext bb = new WebAppContext();
        bb.setServer(server);
        bb.setContextPath("/");
        bb.setWar(getRootPath().resolve(WAR_PATH).toString());

        server.setHandler(bb);

        try {
            System.out.println(">>> STARTING EMBEDDED JETTY SERVER, PRESS ANY KEY TO STOP");
            server.start();
            System.in.read();
            System.out.println(">>> STOPPING EMBEDDED JETTY SERVER");
            server.stop();
            server.join();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    private static Path getRootPath() {
        URL resource = Start.class.getClassLoader().getResource("./");

        if (resource == null) {
            throw new RuntimeException("Could not resolve root path, resource for ./ was null");
        }

        try {
            return Paths.get(resource.toURI()).getParent().getParent();
        } catch (URISyntaxException e) {
            throw new RuntimeException("Could not resolve root path", e);
        }
    }
}
