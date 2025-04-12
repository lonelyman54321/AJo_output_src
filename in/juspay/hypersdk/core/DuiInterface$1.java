/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.widget.Toast
 */
package in.juspay.hypersdk.core;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import in.juspay.hypersdk.core.DuiInterface;
import in.juspay.hypersdk.core.DuiInterface$3;
import in.juspay.hypersmshandler.SmsEventInterface;
import in.juspay.hypersmshandler.SmsEventInterface$RetrieverEvents;

class DuiInterface$1
implements SmsEventInterface {
    final /* synthetic */ DuiInterface this$0;

    public DuiInterface$1(DuiInterface duiInterface) {
        this.this$0 = duiInterface;
    }

    public void onActivityResultEvent(String string2) {
        DuiInterface duiInterface = this.this$0;
        String string3 = (String)duiInterface.callBackMapper.get("SMS_CONSENT");
        duiInterface.invokeCallbackInDUIWebview(string3, string2);
    }

    public void onSentReceiverEvent(int n3) {
        Object object = this.this$0.callBackMapper;
        String string2 = "SEND_SMS";
        if ((object = object.get(string2)) != null) {
            Object object2;
            object = new StringBuilder("window.callUICallback(\"");
            string2 = (String)this.this$0.callBackMapper.get(string2);
            ((StringBuilder)object).append(string2);
            object = ((StringBuilder)object).toString();
            int n4 = -1;
            if (n3 != n4) {
                n4 = 1;
                if (n3 != n4) {
                    n4 = 2;
                    if (n3 != n4) {
                        n4 = 3;
                        if (n3 != n4) {
                            n4 = 4;
                            if (n3 != n4) {
                                object2 = Ft2.a((String)object, "\", \"Unable to Send SMS\", \"837\")");
                            } else {
                                object2 = DuiInterface.access$000(this.this$0);
                                string2 = "SMS NO SERVICE";
                                Toast.makeText((Context)object2, (CharSequence)string2, (int)0).show();
                                object2 = new StringBuilder();
                                ((StringBuilder)object2).append((String)object);
                                object = "\", \"No service\", \"838\")";
                                ((StringBuilder)object2).append((String)object);
                                object2 = ((StringBuilder)object2).toString();
                            }
                        } else {
                            object2 = DuiInterface.access$000(this.this$0);
                            string2 = "SMS NULL PDU";
                            Toast.makeText((Context)object2, (CharSequence)string2, (int)0).show();
                            object2 = new StringBuilder();
                            ((StringBuilder)object2).append((String)object);
                            object = "\", \"Null PDU\", \"839\")";
                            ((StringBuilder)object2).append((String)object);
                            object2 = ((StringBuilder)object2).toString();
                        }
                    } else {
                        object2 = DuiInterface.access$000(this.this$0);
                        string2 = "SMS RADIO OFF";
                        Toast.makeText((Context)object2, (CharSequence)string2, (int)0).show();
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append((String)object);
                        object = "\", \"Radio off\", \"840\")";
                        ((StringBuilder)object2).append((String)object);
                        object2 = ((StringBuilder)object2).toString();
                    }
                } else {
                    object2 = DuiInterface.access$000(this.this$0);
                    string2 = "SMS GENERIC FAILURE";
                    Toast.makeText((Context)object2, (CharSequence)string2, (int)0).show();
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append((String)object);
                    object = "\", \"Generic failure\", \"837\")";
                    ((StringBuilder)object2).append((String)object);
                    object2 = ((StringBuilder)object2).toString();
                }
            } else {
                object2 = DuiInterface.access$000(this.this$0);
                string2 = "SMS SENT";
                Toast.makeText((Context)object2, (CharSequence)string2, (int)0).show();
                object2 = new StringBuilder();
                ((StringBuilder)object2).append((String)object);
                object = "\", \"SUCCESS\")";
                ((StringBuilder)object2).append((String)object);
                object2 = ((StringBuilder)object2).toString();
            }
            object = this.this$0;
            ((DuiInterface)object).invokeFnInDUIWebview((String)object2);
        }
    }

    public void onSmsConsentEvent(Intent intent, int n3, Bundle bundle) {
        this.this$0.juspayServices.startActivityForResult(intent, n3, bundle);
        this.this$0.invokeFnInDUIWebview("onSMSConsentShown", "{ }");
    }

    public void onSmsReceiverEvent(String string2) {
        DuiInterface duiInterface = this.this$0;
        String string3 = (String)duiInterface.callBackMapper.get("SMS_RECEIVE");
        duiInterface.invokeCallbackInDUIWebview(string3, string2);
    }

    public void onSmsRetrieverEvent(SmsEventInterface$RetrieverEvents object, String charSequence) {
        Object object2 = DuiInterface$3.$SwitchMap$in$juspay$hypersmshandler$SmsEventInterface$RetrieverEvents;
        int n3 = ((Enum)object).ordinal();
        n3 = object2[n3];
        int n4 = 1;
        Object object3 = "SMS_RETRIEVER";
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 3;
                if (n3 == n4) {
                    object = this.this$0;
                    object2 = ((DuiInterface)object).callBackMapper;
                    CharSequence charSequence2 = new StringBuilder((String)object3);
                    SmsEventInterface$RetrieverEvents smsEventInterface$RetrieverEvents = SmsEventInterface$RetrieverEvents.ON_RECEIVE;
                    charSequence2.append((Object)smsEventInterface$RetrieverEvents);
                    charSequence2 = charSequence2.toString();
                    object2 = (String)object2.get(charSequence2);
                    ((DuiInterface)object).invokeCallbackInDUIWebview((String)object2, (String)charSequence);
                    object = "TIMEOUT";
                    n3 = (int)(((String)object).equals(charSequence) ? 1 : 0);
                    if (n3 == 0) {
                        object = this.this$0.callBackMapper;
                        charSequence = new StringBuilder((String)object3);
                        ((StringBuilder)charSequence).append((Object)smsEventInterface$RetrieverEvents);
                        charSequence = ((StringBuilder)charSequence).toString();
                        n4 = 0;
                        object2 = null;
                        object.put(charSequence, null);
                    }
                }
            } else {
                object = this.this$0;
                object2 = ((DuiInterface)object).callBackMapper;
                StringBuilder stringBuilder = new StringBuilder((String)object3);
                object3 = SmsEventInterface$RetrieverEvents.ON_RECEIVE;
                stringBuilder.append(object3);
                object3 = stringBuilder.toString();
                object2 = (String)object2.get(object3);
                ((DuiInterface)object).invokeCallbackInDUIWebview((String)object2, (String)charSequence);
            }
        } else {
            object = this.this$0;
            object2 = ((DuiInterface)object).callBackMapper;
            StringBuilder stringBuilder = new StringBuilder((String)object3);
            object3 = SmsEventInterface$RetrieverEvents.ON_ATTACH;
            stringBuilder.append(object3);
            object3 = stringBuilder.toString();
            object2 = (String)object2.get(object3);
            ((DuiInterface)object).invokeCallbackInDUIWebview((String)object2, (String)charSequence);
        }
    }
}

