/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.content.Intent
 *  android.os.IBinder
 */
package androidx.media3.exoplayer.offline;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.media3.exoplayer.offline.DownloadManager;
import androidx.media3.exoplayer.offline.DownloadRequest;
import androidx.media3.exoplayer.offline.DownloadService$a;
import androidx.media3.exoplayer.scheduler.Requirements;
import java.util.HashMap;

public abstract class DownloadService
extends Service {
    public static final HashMap b;
    public DownloadService$a a;

    static {
        HashMap hashMap;
        b = hashMap = new HashMap();
    }

    public abstract DownloadManager a();

    public final IBinder onBind(Intent object) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public final void onCreate() {
        Object object = ((Object)((Object)this)).getClass();
        if ((object = (DownloadService$a)b.get(object)) != null) {
            boolean bl2;
            this.a = object;
            DownloadService downloadService = ((DownloadService$a)object).a;
            if (downloadService == null) {
                bl2 = true;
            } else {
                bl2 = false;
                downloadService = null;
            }
            ct3.f(bl2);
            ((DownloadService$a)object).a = this;
            throw null;
        }
        this.a();
        throw null;
    }

    public final void onDestroy() {
        boolean bl2;
        DownloadService$a downloadService$a = this.a;
        downloadService$a.getClass();
        DownloadService downloadService = downloadService$a.a;
        if (downloadService == this) {
            bl2 = true;
        } else {
            bl2 = false;
            downloadService = null;
        }
        ct3.f(bl2);
        downloadService$a.a = null;
    }

    /*
     * Handled duff style switch with additional control
     * Enabled aggressive block sorting
     */
    public final int onStartCommand(Intent object, int n3, int n4) {
        boolean bl2;
        String string2;
        String string3;
        String string4;
        Object object2 = "androidx.media3.exoplayer.downloadService.action.INIT";
        String string5 = "androidx.media3.exoplayer.downloadService.action.RESTART";
        if (object != null) {
            string4 = object.getAction();
            string3 = object.getStringExtra("content_id");
            string2 = "foreground";
            boolean bl3 = object.getBooleanExtra(string2, false);
            if (!bl3) {
                bl3 = string5.equals(string4);
            }
        } else {
            string4 = null;
            string3 = null;
        }
        if (string4 == null) {
            string4 = object2;
        }
        this.a.getClass();
        string2 = "stop_reason";
        int n7 = -1;
        int n8 = string4.hashCode();
        switch (n8) {
            default: {
                break;
            }
            case 1746253622: {
                object2 = "androidx.media3.exoplayer.downloadService.action.PAUSE_DOWNLOADS";
                bl2 = string4.equals(object2);
                if (!bl2) break;
                n7 = 8;
                break;
            }
            case 845668953: {
                object2 = "androidx.media3.exoplayer.downloadService.action.SET_REQUIREMENTS";
                bl2 = string4.equals(object2);
                if (!bl2) break;
                n7 = 7;
                break;
            }
            case 829812082: {
                object2 = "androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD";
                bl2 = string4.equals(object2);
                if (!bl2) break;
                n7 = 6;
                break;
            }
            case 464223742: {
                object2 = "androidx.media3.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS";
                bl2 = string4.equals(object2);
                if (!bl2) break;
                n7 = 5;
                break;
            }
            case 32678949: {
                object2 = "androidx.media3.exoplayer.downloadService.action.RESUME_DOWNLOADS";
                bl2 = string4.equals(object2);
                if (!bl2) break;
                n7 = 4;
                break;
            }
            case -238450692: {
                bl2 = string4.equals(object2);
                if (!bl2) break;
                n7 = 3;
                break;
            }
            case -659421309: {
                bl2 = string4.equals(string5);
                if (!bl2) break;
                n7 = 2;
                break;
            }
            case -1192305801: {
                object2 = "androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD";
                bl2 = string4.equals(object2);
                if (!bl2) break;
                n7 = 1;
                break;
            }
            case -2068303304: {
                object2 = "androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON";
                bl2 = string4.equals(object2);
                if (!bl2) break;
                n7 = 0;
            }
        }
        int n10 = Integer.MIN_VALUE;
        block21: do {
            switch (n10 == Integer.MIN_VALUE ? n7 : n10) {
                default: {
                    String string6 = "Ignored unrecognized action: ".concat(string4);
                    Cx.c(string6);
                    n10 = 2;
                    continue block21;
                }
                case 8: {
                    throw null;
                }
                case 7: {
                    object.getClass();
                    object2 = "requirements";
                    Requirements requirements = (Requirements)object.getParcelableExtra((String)object2);
                    if (requirements != null) {
                        throw null;
                    }
                    String string7 = "Ignored SET_REQUIREMENTS: Missing requirements extra";
                    Cx.c(string7);
                    n10 = 2;
                    continue block21;
                }
                case 6: {
                    object.getClass();
                    object2 = (DownloadRequest)object.getParcelableExtra("download_request");
                    if (object2 != null) {
                        object.getIntExtra(string2, 0);
                        throw null;
                    }
                    String string8 = "Ignored ADD_DOWNLOAD: Missing download_request extra";
                    Cx.c(string8);
                    n10 = 2;
                    continue block21;
                }
                case 5: {
                    throw null;
                }
                case 4: {
                    throw null;
                }
                case 1: {
                    if (string3 != null) {
                        throw null;
                    }
                    String string9 = "Ignored REMOVE_DOWNLOAD: Missing content_id extra";
                    Cx.c(string9);
                    n10 = 2;
                    continue block21;
                }
                case 0: {
                    object.getClass();
                    bl2 = object.hasExtra(string2);
                    if (bl2) break;
                    String string10 = "Ignored SET_STOP_REASON: Missing stop_reason extra";
                    Cx.c(string10);
                }
                case 2: 
                case 3: {
                    throw null;
                }
            }
            break;
        } while (true);
        object.getIntExtra(string2, 0);
        throw null;
    }

    public final void onTaskRemoved(Intent intent) {
    }
}

