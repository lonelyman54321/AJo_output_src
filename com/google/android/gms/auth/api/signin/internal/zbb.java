/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public final class zbb
implements Runnable {
    private static final Logger zba;
    private final String zbb;
    private final StatusPendingResult zbc;

    static {
        Logger logger;
        String[] stringArray = new String[]{};
        zba = logger = new Logger("RevokeAccessOperation", stringArray);
    }

    public zbb(String object) {
        object = Preconditions.checkNotEmpty((String)object);
        this.zbb = object;
        this.zbc = object = new StatusPendingResult(null);
    }

    public static PendingResult zba(String object) {
        if (object == null) {
            object = new Status(4);
            return PendingResults.immediateFailedResult((Result)object, null);
        }
        zbb zbb2 = new zbb((String)object);
        object = new Thread(zbb2);
        ((Thread)object).start();
        return zbb2.zbc;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Status status;
        block5: {
            IOException iOException2;
            Object[] objectArray;
            Object[] objectArray2;
            block6: {
                String string2 = "Response Code: ";
                objectArray2 = "https://accounts.google.com/o/oauth2/revoke?token=";
                status = Status.RESULT_INTERNAL_ERROR;
                objectArray = null;
                try {
                    CharSequence charSequence = this.zbb;
                    Object[] objectArray3 = new StringBuilder((String)objectArray2);
                    objectArray3.append((String)charSequence);
                    objectArray2 = objectArray3.toString();
                    Object object = new URL((String)objectArray2);
                    objectArray2 = ((URL)object).openConnection();
                    objectArray2 = (HttpURLConnection)objectArray2;
                    object = "Content-Type";
                    charSequence = "application/x-www-form-urlencoded";
                    objectArray2.setRequestProperty((String)object, (String)charSequence);
                    int n3 = objectArray2.getResponseCode();
                    int n4 = 200;
                    if (n3 == n4) {
                        status = Status.RESULT_SUCCESS;
                    } else {
                        object = zba;
                        charSequence = "Unable to revoke access!";
                        objectArray3 = new Object[]{};
                        ((Logger)object).e((String)charSequence, objectArray3);
                    }
                    object = zba;
                    charSequence = new StringBuilder(string2);
                    ((StringBuilder)charSequence).append(n3);
                    string2 = ((StringBuilder)charSequence).toString();
                    objectArray2 = new Object[]{};
                    ((Logger)object).d(string2, objectArray2);
                    break block5;
                }
                catch (Exception exception) {
                }
                catch (IOException iOException2) {
                    break block6;
                }
                objectArray2 = zba;
                String string3 = String.valueOf(((Object)exception).toString());
                objectArray = new Object[]{};
                String string4 = "Exception when revoking access: ";
                string3 = string4.concat(string3);
                objectArray2.e(string3, objectArray);
                break block5;
            }
            objectArray2 = zba;
            String string5 = String.valueOf(((Object)iOException2).toString());
            objectArray = new Object[]{};
            String string6 = "IOException when revoking access: ";
            string5 = string6.concat(string5);
            objectArray2.e(string5, objectArray);
        }
        this.zbc.setResult(status);
    }
}

