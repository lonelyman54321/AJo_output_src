/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.UriMatcher
 *  android.net.Uri
 *  android.provider.ContactsContract$Contacts
 */
import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.InputStream;

/*
 * Renamed from Xd3
 */
public final class xd3_0
extends fw1 {
    public static final UriMatcher d;

    static {
        UriMatcher uriMatcher;
        d = uriMatcher = new UriMatcher(-1);
        String string2 = "com.android.contacts";
        int n3 = 1;
        uriMatcher.addURI(string2, "contacts/lookup/*/#", n3);
        uriMatcher.addURI(string2, "contacts/lookup/*", n3);
        uriMatcher.addURI(string2, "contacts/#/photo", 2);
        uriMatcher.addURI(string2, "contacts/#", 3);
        uriMatcher.addURI(string2, "contacts/#/display_photo", 4);
        uriMatcher.addURI(string2, "phone_lookup/*", 5);
    }

    public final Class a() {
        return InputStream.class;
    }

    public final void c(Object object) {
        ((InputStream)object).close();
    }

    public final Object f(ContentResolver object, Uri object2) {
        block8: {
            block7: {
                int n3;
                UriMatcher uriMatcher;
                block5: {
                    block6: {
                        uriMatcher = d;
                        int n4 = uriMatcher.match(object2);
                        if (n4 == (n3 = 1)) break block5;
                        int n7 = 3;
                        if (n4 == n7) break block6;
                        n7 = 5;
                        if (n4 == n7) break block5;
                        object = object.openInputStream(object2);
                        break block7;
                    }
                    object = ContactsContract.Contacts.openContactPhotoInputStream((ContentResolver)object, (Uri)object2, n3 != 0);
                    break block7;
                }
                if ((uriMatcher = ContactsContract.Contacts.lookupContact((ContentResolver)object, (Uri)object2)) == null) break block8;
                object = ContactsContract.Contacts.openContactPhotoInputStream((ContentResolver)object, (Uri)uriMatcher, n3 != 0);
            }
            if (object != null) {
                return object;
            }
            object2 = og3_1.a(object2, "InputStream is null for ");
            object = new FileNotFoundException((String)object2);
            throw object;
        }
        object = new FileNotFoundException("Contact cannot be found");
        throw object;
    }
}

