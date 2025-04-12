/*
 * Decompiled with CFR 0.152.
 */
import java.net.URL;
import org.jsoup.Connection;
import org.jsoup.helper.RequestAuthenticator;

/*
 * Renamed from b50
 */
public final class b50_0 {
    public static Connection a(Connection object, RequestAuthenticator requestAuthenticator) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public static Connection b(Connection connection, String string2) {
        return connection.newRequest().url(string2);
    }

    public static Connection c(Connection connection, URL uRL) {
        return connection.newRequest().url(uRL);
    }
}

