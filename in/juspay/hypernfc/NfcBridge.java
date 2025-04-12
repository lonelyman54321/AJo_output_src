/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.util.Base64
 *  org.json.JSONObject
 */
package in.juspay.hypernfc;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import com.cardreader.card_reader_lib.CardTask;
import in.juspay.hyper.bridge.HyperBridge;
import in.juspay.hyper.core.BridgeComponents;
import in.juspay.hyper.core.CallbackInvoker;
import in.juspay.hypernfc.NfcActivity;
import in.juspay.hypernfc.NfcBridge$Companion;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import org.json.JSONObject;

public final class NfcBridge
extends HyperBridge {
    public static final NfcBridge$Companion Companion;
    private static final int NFC_CARD_REQUEST = 121;
    private static final int SETTINGS_REQUEST = 144;
    private String callback;
    private final CardTask cardTask;
    private int waitingTime;

    static {
        NfcBridge$Companion nfcBridge$Companion;
        Companion = nfcBridge$Companion = new NfcBridge$Companion(null);
    }

    public NfcBridge(BridgeComponents object) {
        Intrinsics.checkNotNullParameter(object, "bridgeComponents");
        super((BridgeComponents)object);
        this.cardTask = object = new CardTask();
    }

    private final void showLoadingScreen(String string2, int n3) {
        this.callback = string2;
        this.waitingTime = n3;
        Context context = this.getBridgeComponents().getContext();
        string2 = new Intent(context, NfcActivity.class);
        string2.putExtra("waitingTime", n3);
        this.getBridgeComponents().getFragmentHooks().startActivityForResult((Intent)string2, 121, null);
    }

    public final boolean isNFCEnabled() {
        CardTask cardTask = this.cardTask;
        Context context = this.getBridgeComponents().getContext();
        return cardTask.isNFCEnabled(context);
    }

    public final boolean isNFCSupportPresent() {
        CardTask cardTask = this.cardTask;
        Context context = this.getBridgeComponents().getContext();
        return cardTask.isNFCSupported(context);
    }

    public boolean onActivityResult(int n3, int n4, Intent object) {
        block30: {
            String string2;
            Object object2;
            boolean bl2;
            String string3;
            int n7;
            block29: {
                Bundle bundle;
                String string4 = "result_data";
                int n8 = 121;
                n7 = 144;
                if (n3 != n7 && n3 != n8) {
                    return false;
                }
                string3 = "{\"error\":\"Couldn't read the card! Try again or type your card number\"}";
                String string5 = null;
                if (object != null) {
                    bundle = object.getExtras();
                } else {
                    bundle = null;
                }
                bl2 = true;
                if (n3 == n8 && (n4 == (n8 = -1) || n4 == 0)) {
                    block27: {
                        if (object != null) {
                            block28: {
                                n3 = (int)(object.hasExtra(string4) ? 1 : 0);
                                if (n3 == 0) break block27;
                                if (bundle == null) break block28;
                                string5 = bundle.getString(string4);
                            }
                            object2 = this.getBridgeComponents();
                            object2 = object2.getCallbackInvoker();
                            string2 = this.callback;
                            object2.invokeCallbackInDUIWebview(string2, string5);
                            return bl2;
                        }
                    }
                    object2 = this.getBridgeComponents();
                    object2 = object2.getCallbackInvoker();
                    string2 = this.callback;
                    object2.invokeCallbackInDUIWebview(string2, string3);
                }
                if (n3 == n7) {
                    n4 = (int)(this.isNFCEnabled() ? 1 : 0);
                    if (n4 == 0) break block29;
                    object2 = this.callback;
                    n4 = this.waitingTime;
                    this.openNFCReader((String)object2, n4);
                    return bl2;
                }
            }
            if (n3 != n7) break block30;
            n3 = (int)(this.isNFCEnabled() ? 1 : 0);
            if (n3 != 0) break block30;
            object2 = this.getBridgeComponents();
            object2 = object2.getCallbackInvoker();
            string2 = this.callback;
            object = "{\"error\":\"Permission denied!\"}";
            try {
                object2.invokeCallbackInDUIWebview(string2, (String)object);
                return bl2;
            }
            catch (Exception exception) {
                object2 = this.getBridgeComponents().getCallbackInvoker();
                string2 = this.callback;
                object2.invokeCallbackInDUIWebview(string2, string3);
            }
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void openNFCReader(String string2, int n3) {
        Exception exception2;
        int n4;
        block4: {
            n4 = 1;
            this.callback = string2;
            this.waitingTime = n3;
            try {
                n3 = (int)(this.isNFCSupportPresent() ? 1 : 0);
                if (n3 != 0 && (n3 = (int)(this.isNFCEnabled() ? 1 : 0)) != 0) {
                    n3 = this.waitingTime;
                    this.showLoadingScreen(string2, n3);
                    return;
                }
            }
            catch (Exception exception2) {
                break block4;
            }
            n3 = (int)(this.isNFCSupportPresent() ? 1 : 0);
            Object object = null;
            if (n3 != 0) {
                Object object2 = this.getBridgeComponents();
                object2 = object2.getFragmentHooks();
                String string3 = "android.settings.NFC_SETTINGS";
                Intent intent = new Intent(string3);
                int n7 = 144;
                object2.startActivityForResult(intent, n7, null);
                return;
            }
            Object object3 = new JSONObject();
            String string4 = "error";
            String string5 = "Does not support";
            object3.put(string4, (Object)string5);
            string4 = "data";
            object3.put(string4, null);
            object = this.getBridgeComponents();
            object = object.getCallbackInvoker();
            string4 = this.callback;
            object3 = object3.toString();
            object.invokeCallbackInDUIWebview(string4, (String)object3);
            return;
        }
        CallbackInvoker callbackInvoker = this.getBridgeComponents().getCallbackInvoker();
        Object[] objectArray = StringCompanionObject.INSTANCE;
        Object object = ((Object)exception2).toString();
        objectArray = Charsets.UTF_8;
        object = ((String)object).getBytes((Charset)objectArray);
        Intrinsics.checkNotNullExpressionValue(object, "this as java.lang.String).getBytes(charset)");
        int n8 = 2;
        object = Base64.encodeToString((byte[])object, (int)n8);
        objectArray = new Object[n4];
        boolean bl2 = false;
        objectArray[0] = object;
        String string6 = "format(format, *args)";
        object = xh2_0.a(objectArray, n4, "{\"error\":\"true\",\"data\":\"%s\"}", string6);
        callbackInvoker.invokeCallbackInDUIWebview(string2, (String)object);
    }
}

