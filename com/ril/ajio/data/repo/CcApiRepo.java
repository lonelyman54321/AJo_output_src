/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
package com.ril.ajio.data.repo;

import android.content.Context;
import android.text.TextUtils;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.data.repo.BaseRepo;
import com.ril.ajio.data.repo.CcApiRepo$Companion;
import com.ril.ajio.data.repo.CcApiRepo$createCCTicket$$inlined$map$1;
import com.ril.ajio.data.repo.CcApiRepo$createCCTicket$1;
import com.ril.ajio.data.repo.CcApiRepo$createComplaintTicket$$inlined$map$1;
import com.ril.ajio.data.repo.CcApiRepo$createComplaintTicket$1;
import com.ril.ajio.data.repo.CcApiRepo$createComplaintTicketMultiFiles$$inlined$map$1;
import com.ril.ajio.data.repo.CcApiRepo$createComplaintTicketMultiFiles$1;
import com.ril.ajio.data.repo.CcApiRepo$getCCComplaintDetail$$inlined$map$1;
import com.ril.ajio.data.repo.CcApiRepo$getCCComplaintDetail$1;
import com.ril.ajio.data.repo.CcApiRepo$getCCComplaintList$$inlined$map$1;
import com.ril.ajio.data.repo.CcApiRepo$getCCComplaintList$1;
import com.ril.ajio.data.repo.CcApiRepo$getCCFaqSearch$$inlined$map$1;
import com.ril.ajio.data.repo.CcApiRepo$getCCFaqSearch$1;
import com.ril.ajio.data.repo.CcApiRepo$getCCFaqs$$inlined$map$1;
import com.ril.ajio.data.repo.CcApiRepo$getCCFaqs$1;
import com.ril.ajio.data.repo.CcApiRepo$getCCItemDetailsQA$$inlined$map$1;
import com.ril.ajio.data.repo.CcApiRepo$getCCItemDetailsQA$1;
import com.ril.ajio.data.repo.CcApiRepo$getCCSelectedEntryStatus$$inlined$map$1;
import com.ril.ajio.data.repo.CcApiRepo$getCCSelectedEntryStatus$1;
import com.ril.ajio.data.repo.CcApiRepo$getCallMeBackInfo$$inlined$map$1;
import com.ril.ajio.data.repo.CcApiRepo$getCallMeBackInfo$1;
import com.ril.ajio.data.repo.CcApiRepo$initiateChat$$inlined$map$1;
import com.ril.ajio.data.repo.CcApiRepo$initiateChat$1;
import com.ril.ajio.data.repo.CcApiRepo$submitCallMeBackDetail$$inlined$map$1;
import com.ril.ajio.data.repo.CcApiRepo$submitCallMeBackDetail$1;
import com.ril.ajio.services.data.CustomerCare.CCComplaintAttachInfo;
import com.ril.ajio.services.data.CustomerCare.CCComplaintAttachInfoNew;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.network.api.CcApi;
import com.ril.ajio.services.network.connector.AjioApiConnector;
import com.ril.ajio.services.query.CustomerCareQuery.CCTicketCreateQuery;
import com.ril.ajio.services.query.QuerySubmitCallMeBack;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class CcApiRepo
implements BaseRepo {
    public static final int $stable = 0;
    public static final CcApiRepo$Companion Companion;
    private static final String FIELD_BASIC = "BASIC";
    private static final String FIELD_FULL = "FULL";
    private static final String authorizedQueryParams;
    private static final String clientType;
    private static final String clientVersion;
    private final CcApi ccApi;
    private final UserInformation userInformation;

    static {
        Object object = new CcApiRepo$Companion(null);
        Companion = object;
        $stable = 8;
        clientType = "Android";
        clientVersion = object = em_1.a(AJIOApplication.Companion);
        authorizedQueryParams = "client_type=Android&client_version=".concat((String)object);
    }

    public CcApiRepo(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        object = UserInformation.getInstance(object);
        this.userInformation = object;
        object = AjioApiConnector.INSTANCE.getCcApi();
        this.ccApi = object;
    }

    public static final /* synthetic */ CcApi access$getCcApi$p(CcApiRepo ccApiRepo) {
        return ccApiRepo.ccApi;
    }

    public static final /* synthetic */ String access$getClientType$cp() {
        return clientType;
    }

    public static final /* synthetic */ String access$getClientVersion$cp() {
        return clientVersion;
    }

    public static final /* synthetic */ UserInformation access$getUserInformation$p(CcApiRepo ccApiRepo) {
        return ccApiRepo.userInformation;
    }

    public final es0_2 createCCTicket(CCTicketCreateQuery object) {
        Object object2;
        String string2;
        Object object3;
        HashMap<Object, String> hashMap;
        Object object4;
        block74: {
            boolean bl2;
            block73: {
                block72: {
                    block71: {
                        block70: {
                            block69: {
                                block68: {
                                    block67: {
                                        block66: {
                                            block65: {
                                                block64: {
                                                    block63: {
                                                        block62: {
                                                            block61: {
                                                                block60: {
                                                                    block59: {
                                                                        block58: {
                                                                            block57: {
                                                                                block56: {
                                                                                    block55: {
                                                                                        block54: {
                                                                                            block53: {
                                                                                                block52: {
                                                                                                    Intrinsics.checkNotNullParameter(object, "query");
                                                                                                    object4 = new Ref$ObjectRef();
                                                                                                    hashMap = UrlHelper.Companion.getInstance();
                                                                                                    object3 = new Object[]{};
                                                                                                    string2 = "createnewticket";
                                                                                                    hashMap = ((UrlHelper)((Object)hashMap)).getApiUrl("customercare", string2, (Object[])object3);
                                                                                                    ((Ref$ObjectRef)object4).element = hashMap;
                                                                                                    object3 = authorizedQueryParams;
                                                                                                    object2 = "?fields=FULL&";
                                                                                                    hashMap = nb0_0.a((String)((Object)hashMap), (String)object2, (String)object3);
                                                                                                    ((Ref$ObjectRef)object4).element = hashMap;
                                                                                                    hashMap = new HashMap<Object, String>();
                                                                                                    object3 = "orderCode";
                                                                                                    object2 = ((CCTicketCreateQuery)object).getOrderCode();
                                                                                                    bl2 = TextUtils.isEmpty((CharSequence)object2);
                                                                                                    string2 = "";
                                                                                                    if (!bl2) break block52;
                                                                                                    object2 = string2;
                                                                                                    break block53;
                                                                                                }
                                                                                                object2 = ((CCTicketCreateQuery)object).getOrderCode();
                                                                                            }
                                                                                            hashMap.put(object3, (String)object2);
                                                                                            object3 = "category";
                                                                                            object2 = ((CCTicketCreateQuery)object).getCategory();
                                                                                            bl2 = TextUtils.isEmpty((CharSequence)object2);
                                                                                            if (!bl2) break block54;
                                                                                            object2 = string2;
                                                                                            break block55;
                                                                                        }
                                                                                        object2 = ((CCTicketCreateQuery)object).getCategory();
                                                                                    }
                                                                                    hashMap.put(object3, (String)object2);
                                                                                    object3 = "subCategory";
                                                                                    object2 = ((CCTicketCreateQuery)object).getSubCategory();
                                                                                    bl2 = TextUtils.isEmpty((CharSequence)object2);
                                                                                    if (!bl2) break block56;
                                                                                    object2 = string2;
                                                                                    break block57;
                                                                                }
                                                                                object2 = ((CCTicketCreateQuery)object).getSubCategory();
                                                                            }
                                                                            hashMap.put(object3, (String)object2);
                                                                            object3 = "leafCategory";
                                                                            object2 = ((CCTicketCreateQuery)object).getLeafCategory();
                                                                            bl2 = TextUtils.isEmpty((CharSequence)object2);
                                                                            if (!bl2) break block58;
                                                                            object2 = string2;
                                                                            break block59;
                                                                        }
                                                                        object2 = ((CCTicketCreateQuery)object).getLeafCategory();
                                                                    }
                                                                    hashMap.put(object3, (String)object2);
                                                                    object3 = "description";
                                                                    object2 = ((CCTicketCreateQuery)object).getDescription();
                                                                    bl2 = TextUtils.isEmpty((CharSequence)object2);
                                                                    if (!bl2) break block60;
                                                                    object2 = string2;
                                                                    break block61;
                                                                }
                                                                object2 = ((CCTicketCreateQuery)object).getDescription();
                                                            }
                                                            hashMap.put(object3, (String)object2);
                                                            object3 = "noOfDays";
                                                            object2 = ((CCTicketCreateQuery)object).getNoOfDays();
                                                            bl2 = TextUtils.isEmpty((CharSequence)object2);
                                                            if (!bl2) break block62;
                                                            object2 = string2;
                                                            break block63;
                                                        }
                                                        object2 = ((CCTicketCreateQuery)object).getNoOfDays();
                                                    }
                                                    hashMap.put(object3, (String)object2);
                                                    object3 = "workgroup";
                                                    object2 = ((CCTicketCreateQuery)object).getWorkgroup();
                                                    bl2 = TextUtils.isEmpty((CharSequence)object2);
                                                    if (!bl2) break block64;
                                                    object2 = string2;
                                                    break block65;
                                                }
                                                object2 = ((CCTicketCreateQuery)object).getWorkgroup();
                                            }
                                            hashMap.put(object3, (String)object2);
                                            object3 = "contentType";
                                            object2 = ((CCTicketCreateQuery)object).getContentType();
                                            bl2 = TextUtils.isEmpty((CharSequence)object2);
                                            if (!bl2) break block66;
                                            object2 = string2;
                                            break block67;
                                        }
                                        object2 = ((CCTicketCreateQuery)object).getContentType();
                                    }
                                    hashMap.put(object3, (String)object2);
                                    object3 = "comments";
                                    object2 = ((CCTicketCreateQuery)object).getComments();
                                    bl2 = TextUtils.isEmpty((CharSequence)object2);
                                    if (!bl2) break block68;
                                    object2 = string2;
                                    break block69;
                                }
                                object2 = ((CCTicketCreateQuery)object).getComments();
                            }
                            hashMap.put(object3, (String)object2);
                            object3 = "fileName";
                            object2 = ((CCTicketCreateQuery)object).getFileName();
                            bl2 = TextUtils.isEmpty((CharSequence)object2);
                            if (!bl2) break block70;
                            object2 = string2;
                            break block71;
                        }
                        object2 = ((CCTicketCreateQuery)object).getFileName();
                    }
                    hashMap.put(object3, (String)object2);
                    object3 = "base64String";
                    object2 = ((CCTicketCreateQuery)object).getBase64String();
                    bl2 = TextUtils.isEmpty((CharSequence)object2);
                    if (!bl2) break block72;
                    object2 = string2;
                    break block73;
                }
                object2 = ((CCTicketCreateQuery)object).getBase64String();
            }
            hashMap.put(object3, (String)object2);
            object3 = "incidentToReopen";
            bl2 = ((CCTicketCreateQuery)object).getIncidentToReopen();
            object2 = bl2;
            hashMap.put(object3, (String)object2);
            object3 = "currentIncidentNum";
            object2 = ((CCTicketCreateQuery)object).getCurrentIncidentNum();
            bl2 = TextUtils.isEmpty((CharSequence)object2);
            if (bl2) break block74;
            string2 = ((CCTicketCreateQuery)object).getCurrentIncidentNum();
        }
        try {
            hashMap.put(object3, string2);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            object3 = yn3_0.a;
            object2 = "CcApiRepo";
            ((yn3$a)object3).l((String)object2);
            ((yn3$a)object3).e(unsupportedEncodingException);
        }
        object = new CcApiRepo$createCCTicket$1(this, (Ref$ObjectRef)object4, hashMap, null);
        object4 = new br2_2((Function2)object);
        object = ir0_2.a;
        object = em0_2.b;
        object = ms0_1.m((es0_2)object4, (CoroutineContext)object);
        object4 = new CcApiRepo$createCCTicket$$inlined$map$1((es0_2)object);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object4, (CoroutineContext)object);
    }

    public final es0_2 createComplaintTicket(CCComplaintAttachInfo object) {
        String string2;
        String string3;
        Object object2;
        HashMap<Object, String> hashMap;
        Object object3;
        block25: {
            boolean bl2;
            block24: {
                block23: {
                    block22: {
                        block21: {
                            block20: {
                                block19: {
                                    Intrinsics.checkNotNullParameter(object, "query");
                                    object3 = new Ref$ObjectRef();
                                    hashMap = UrlHelper.Companion.getInstance();
                                    object2 = new Object[]{};
                                    string3 = "complaint_attach";
                                    hashMap = ((UrlHelper)((Object)hashMap)).getApiUrl("customercare", string3, (Object[])object2);
                                    ((Ref$ObjectRef)object3).element = hashMap;
                                    object2 = authorizedQueryParams;
                                    string2 = "?fields=FULL&";
                                    hashMap = nb0_0.a((String)((Object)hashMap), string2, (String)object2);
                                    ((Ref$ObjectRef)object3).element = hashMap;
                                    hashMap = new HashMap<Object, String>();
                                    object2 = "incidentId";
                                    string2 = ((CCComplaintAttachInfo)object).getIncidentId();
                                    hashMap.put(object2, string2);
                                    object2 = "base64String";
                                    string2 = ((CCComplaintAttachInfo)object).getBase64String();
                                    bl2 = TextUtils.isEmpty((CharSequence)string2);
                                    string3 = "";
                                    if (!bl2) break block19;
                                    string2 = string3;
                                    break block20;
                                }
                                string2 = ((CCComplaintAttachInfo)object).getBase64String();
                            }
                            hashMap.put(object2, string2);
                            object2 = "contentType";
                            string2 = ((CCComplaintAttachInfo)object).getContentType();
                            bl2 = TextUtils.isEmpty((CharSequence)string2);
                            if (!bl2) break block21;
                            string2 = string3;
                            break block22;
                        }
                        string2 = ((CCComplaintAttachInfo)object).getContentType();
                    }
                    hashMap.put(object2, string2);
                    object2 = "comments";
                    string2 = ((CCComplaintAttachInfo)object).getComments();
                    bl2 = TextUtils.isEmpty((CharSequence)string2);
                    if (!bl2) break block23;
                    string2 = string3;
                    break block24;
                }
                string2 = ((CCComplaintAttachInfo)object).getComments();
            }
            hashMap.put(object2, string2);
            object2 = "fileName";
            string2 = ((CCComplaintAttachInfo)object).getFileName();
            bl2 = TextUtils.isEmpty((CharSequence)string2);
            if (bl2) break block25;
            string3 = ((CCComplaintAttachInfo)object).getFileName();
        }
        try {
            hashMap.put(object2, string3);
        }
        catch (Exception exception) {
            object2 = yn3_0.a;
            string2 = "CcApiRepo";
            ((yn3$a)object2).l(string2);
            ((yn3$a)object2).e(exception);
        }
        object = new CcApiRepo$createComplaintTicket$1(this, (Ref$ObjectRef)object3, hashMap, null);
        object3 = new br2_2((Function2)object);
        object = ir0_2.a;
        object = em0_2.b;
        object = ms0_1.m((es0_2)object3, (CoroutineContext)object);
        object3 = new CcApiRepo$createComplaintTicket$$inlined$map$1((es0_2)object);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object3, (CoroutineContext)object);
    }

    public final es0_2 createComplaintTicketMultiFiles(CCComplaintAttachInfoNew object) {
        Intrinsics.checkNotNullParameter(object, "attachInfo");
        Object object2 = new Ref$ObjectRef();
        Object object3 = UrlHelper.Companion.getInstance();
        Object object4 = new Object[]{};
        ((Ref$ObjectRef)object2).element = object3 = ((UrlHelper)object3).getApiUrl("customercare", "complaint_attach_new", object4);
        object4 = authorizedQueryParams;
        ((Ref$ObjectRef)object2).element = object3 = nb0_0.a((String)object3, "?fields=FULL&", (String)object4);
        object3 = new CcApiRepo$createComplaintTicketMultiFiles$1(this, (Ref$ObjectRef)object2, (CCComplaintAttachInfoNew)object, null);
        object = new br2_2((Function2)object3);
        object2 = ir0_2.a;
        object2 = em0_2.b;
        object = ms0_1.m((es0_2)object, (CoroutineContext)object2);
        object2 = new CcApiRepo$createComplaintTicketMultiFiles$$inlined$map$1((es0_2)object);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object2, (CoroutineContext)object);
    }

    public final es0_2 getCCComplaintDetail(String object) {
        Intrinsics.checkNotNullParameter(object, "incidentID");
        Object object2 = new Ref$ObjectRef();
        Object object3 = UrlHelper.Companion.getInstance();
        Object object4 = new Object[]{};
        ((Ref$ObjectRef)object2).element = object3 = ((UrlHelper)object3).getApiUrl("customercare", "complaint_details", object4);
        object4 = authorizedQueryParams;
        ((Ref$ObjectRef)object2).element = object3 = nb0_0.a((String)object3, "?fields=FULL&", (String)object4);
        object = p3.a("incidentid", (String)object);
        object3 = new CcApiRepo$getCCComplaintDetail$1(this, (Ref$ObjectRef)object2, (Map)object, null);
        object = new br2_2((Function2)object3);
        object2 = ir0_2.a;
        object2 = em0_2.b;
        object = ms0_1.m((es0_2)object, (CoroutineContext)object2);
        object2 = new CcApiRepo$getCCComplaintDetail$$inlined$map$1((es0_2)object);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object2, (CoroutineContext)object);
    }

    public final es0_2 getCCComplaintList() {
        Object object = new Ref$ObjectRef();
        Object object2 = UrlHelper.Companion.getInstance();
        Object object3 = new Object[]{};
        ((Ref$ObjectRef)object).element = object2 = ((UrlHelper)object2).getApiUrl("customercare", "ticket_list", object3);
        object2 = new HashMap();
        object3 = this.userInformation.getUserId();
        ((HashMap)object2).put("customerUID", object3);
        object3 = new CcApiRepo$getCCComplaintList$1(this, (Ref$ObjectRef)object, (Map)object2, null);
        object = new br2_2((Function2)object3);
        object2 = ir0_2.a;
        object2 = em0_2.b;
        object = ms0_1.m((es0_2)object, (CoroutineContext)object2);
        object2 = new CcApiRepo$getCCComplaintList$$inlined$map$1((es0_2)object);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object2, (CoroutineContext)object);
    }

    public final es0_2 getCCFaqSearch(String object) {
        Intrinsics.checkNotNullParameter(object, "searchFaqText");
        Object object2 = new Ref$ObjectRef();
        Object object3 = UrlHelper.Companion.getInstance();
        Object object4 = new Object[]{};
        ((Ref$ObjectRef)object2).element = object3 = ((UrlHelper)object3).getApiUrl("customercare", "cc_faq_search", object4);
        object4 = authorizedQueryParams;
        ((Ref$ObjectRef)object2).element = object3 = nb0_0.a((String)object3, "?fields=FULL&", (String)object4);
        object = p3.a("query", (String)object);
        object3 = new CcApiRepo$getCCFaqSearch$1(this, (Ref$ObjectRef)object2, (Map)object, null);
        object = new br2_2((Function2)object3);
        object2 = ir0_2.a;
        object2 = em0_2.b;
        object = ms0_1.m((es0_2)object, (CoroutineContext)object2);
        object2 = new CcApiRepo$getCCFaqSearch$$inlined$map$1((es0_2)object);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object2, (CoroutineContext)object);
    }

    public final es0_2 getCCFaqs() {
        Object object = new Ref$ObjectRef();
        Object object2 = UrlHelper.Companion.getInstance();
        Object object3 = new Object[]{};
        ((Ref$ObjectRef)object).element = object2 = ((UrlHelper)object2).getApiUrl("customercare", "cc_faq", object3);
        object3 = authorizedQueryParams;
        ((Ref$ObjectRef)object).element = object2 = nb0_0.a((String)object2, "?fields=FULL&", (String)object3);
        object2 = new CcApiRepo$getCCFaqs$1(this, (Ref$ObjectRef)object, null);
        object = new br2_2((Function2)object2);
        object2 = ir0_2.a;
        object2 = em0_2.b;
        object = ms0_1.m((es0_2)object, (CoroutineContext)object2);
        object2 = new CcApiRepo$getCCFaqs$$inlined$map$1((es0_2)object);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object2, (CoroutineContext)object);
    }

    public final es0_2 getCCItemDetailsQA(String object, String object2, String string2) {
        String string3 = "orderNumber";
        Intrinsics.checkNotNullParameter(object, string3);
        String string4 = "entryNumber";
        Intrinsics.checkNotNullParameter(object2, string4);
        String string5 = "itemStatus";
        Intrinsics.checkNotNullParameter(string2, string5);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        HashMap<String, String> hashMap = UrlHelper.Companion.getInstance();
        Object object3 = new Object[]{};
        hashMap = ((UrlHelper)((Object)hashMap)).getApiUrl("customercare", "item_status_qa", object3);
        ref$ObjectRef.element = hashMap;
        object3 = authorizedQueryParams;
        hashMap = nb0_0.a((String)((Object)hashMap), "?fields=FULL&", (String)object3);
        ref$ObjectRef.element = hashMap;
        hashMap = new HashMap<String, String>();
        hashMap.put(string3, (String)object);
        hashMap.put(string4, (String)object2);
        hashMap.put(string5, string2);
        hashMap.put("fields", FIELD_FULL);
        object = new CcApiRepo$getCCItemDetailsQA$1(this, ref$ObjectRef, hashMap, null);
        object2 = new br2_2((Function2)object);
        object = ir0_2.a;
        object = em0_2.b;
        object = ms0_1.m((es0_2)object2, (CoroutineContext)object);
        object2 = new CcApiRepo$getCCItemDetailsQA$$inlined$map$1((es0_2)object);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object2, (CoroutineContext)object);
    }

    public final es0_2 getCCSelectedEntryStatus(String object, String object2) {
        String string2 = "orderNumber";
        Intrinsics.checkNotNullParameter(object, string2);
        String string3 = "entryNumber";
        Intrinsics.checkNotNullParameter(object2, string3);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        HashMap<String, String> hashMap = UrlHelper.Companion.getInstance();
        Object[] objectArray = new Object[]{};
        hashMap = ((UrlHelper)((Object)hashMap)).getApiUrl("customercare", "item_status", objectArray);
        ref$ObjectRef.element = hashMap;
        hashMap = new HashMap<String, String>();
        hashMap.put(string2, (String)object);
        hashMap.put(string3, (String)object2);
        hashMap.put("fields", FIELD_FULL);
        object = new CcApiRepo$getCCSelectedEntryStatus$1(this, ref$ObjectRef, hashMap, null);
        object2 = new br2_2((Function2)object);
        object = ir0_2.a;
        object = em0_2.b;
        object = ms0_1.m((es0_2)object2, (CoroutineContext)object);
        object2 = new CcApiRepo$getCCSelectedEntryStatus$$inlined$map$1((es0_2)object);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object2, (CoroutineContext)object);
    }

    public final es0_2 getCallMeBackInfo() {
        Object object = new Ref$ObjectRef();
        Object object2 = UrlHelper.Companion.getInstance();
        Object object3 = new Object[]{};
        ((Ref$ObjectRef)object).element = object2 = ((UrlHelper)object2).getApiUrl("customercare", "callmeback_detail", object3);
        object3 = authorizedQueryParams;
        ((Ref$ObjectRef)object).element = object2 = nb0_0.a((String)object2, "?fields=FULL&", (String)object3);
        object2 = new CcApiRepo$getCallMeBackInfo$1(this, (Ref$ObjectRef)object, null);
        object = new br2_2((Function2)object2);
        object2 = ir0_2.a;
        object2 = em0_2.b;
        object = ms0_1.m((es0_2)object, (CoroutineContext)object2);
        object2 = new CcApiRepo$getCallMeBackInfo$$inlined$map$1((es0_2)object);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object2, (CoroutineContext)object);
    }

    public final es0_2 initiateChat() {
        Object object = new Ref$ObjectRef();
        Object object2 = UrlHelper.Companion.getInstance();
        Object object3 = new Object[]{};
        ((Ref$ObjectRef)object).element = object2 = ((UrlHelper)object2).getApiUrl("customercare", "initiate_chat", object3);
        object3 = authorizedQueryParams;
        ((Ref$ObjectRef)object).element = object2 = nb0_0.a((String)object2, "?fields=FULL&", (String)object3);
        object2 = new HashMap();
        object3 = this.userInformation.getUserId();
        ((HashMap)object2).put("customerUID", object3);
        object3 = new CcApiRepo$initiateChat$1(this, (Ref$ObjectRef)object, (Map)object2, null);
        object = new br2_2((Function2)object3);
        object2 = ir0_2.a;
        object2 = em0_2.b;
        object = ms0_1.m((es0_2)object, (CoroutineContext)object2);
        object2 = new CcApiRepo$initiateChat$$inlined$map$1((es0_2)object);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object2, (CoroutineContext)object);
    }

    public final es0_2 submitCallMeBackDetail(QuerySubmitCallMeBack object) {
        Intrinsics.checkNotNullParameter(object, "querySubmitCallMeBack");
        Object object2 = new Ref$ObjectRef();
        HashMap<String, Object[]> hashMap = UrlHelper.Companion.getInstance();
        int n3 = 0;
        Object object3 = new Object[]{};
        String string2 = "submit_callmeback";
        hashMap = ((UrlHelper)((Object)hashMap)).getApiUrl("customercare", string2, (Object[])object3);
        ((Ref$ObjectRef)object2).element = hashMap;
        object3 = authorizedQueryParams;
        hashMap = nb0_0.a((String)((Object)hashMap), "?fields=FULL&", (String)object3);
        ((Ref$ObjectRef)object2).element = hashMap;
        hashMap = new HashMap<String, Object[]>();
        object3 = ((QuerySubmitCallMeBack)object).getLanguage();
        Object object4 = "";
        if (object3 == null) {
            object3 = object4;
        }
        string2 = "language";
        hashMap.put(string2, (Object[])object3);
        object3 = ((QuerySubmitCallMeBack)object).getComments();
        if (object3 == null) {
            object3 = object4;
        }
        string2 = "comments";
        hashMap.put(string2, (Object[])object3);
        object3 = ((QuerySubmitCallMeBack)object).getIssueTopic();
        if (object3 == null) {
            object3 = object4;
        }
        string2 = "issue_topic";
        hashMap.put(string2, (Object[])object3);
        object3 = ((QuerySubmitCallMeBack)object).getIssueCategory();
        if (object3 == null) {
            object3 = object4;
        }
        string2 = "issue_category";
        hashMap.put(string2, (Object[])object3);
        object3 = ((QuerySubmitCallMeBack)object).getIssueSubcategory();
        if (object3 == null) {
            object3 = object4;
        }
        string2 = "issue_subcategory";
        hashMap.put(string2, (Object[])object3);
        object3 = ((QuerySubmitCallMeBack)object).getOrderNumber();
        if (object3 == null) {
            object3 = object4;
        }
        string2 = "order_number";
        hashMap.put(string2, (Object[])object3);
        object3 = ((QuerySubmitCallMeBack)object).getOrderStatus();
        if (object3 == null) {
            object3 = object4;
        }
        string2 = "order_status";
        hashMap.put(string2, (Object[])object3);
        object3 = ((QuerySubmitCallMeBack)object).getInterventionIntent();
        if (object3 == null) {
            object3 = object4;
        }
        string2 = "Intervention_intent";
        hashMap.put(string2, (Object[])object3);
        object3 = ((QuerySubmitCallMeBack)object).getProductId();
        if (object3 == null) {
            object3 = object4;
        }
        string2 = "product";
        hashMap.put(string2, (Object[])object3);
        object3 = ((QuerySubmitCallMeBack)object).getOtherInformation();
        if (object3 == null) {
            object3 = object4;
        }
        string2 = "other_information";
        hashMap.put(string2, (Object[])object3);
        object3 = ((QuerySubmitCallMeBack)object).getPhoneNumber();
        if (object3 != null) {
            object4 = object3;
        }
        hashMap.put("phoneNumber", (Object[])object4);
        object3 = ((QuerySubmitCallMeBack)object).getSlotDay();
        if (object3 != null && (n3 = ((String)object3).length()) != 0) {
            object3 = "slotDay";
            object4 = ((QuerySubmitCallMeBack)object).getSlotDay();
            hashMap.put((String)object3, (Object[])object4);
        }
        if ((object3 = ((QuerySubmitCallMeBack)object).getSlotTime()) != null && (n3 = ((String)object3).length()) != 0) {
            object3 = "slotTime";
            object = ((QuerySubmitCallMeBack)object).getSlotTime();
            hashMap.put((String)object3, (Object[])object);
        }
        object = new CcApiRepo$submitCallMeBackDetail$1(this, (Ref$ObjectRef)object2, hashMap, null);
        object2 = new br2_2((Function2)object);
        object = ir0_2.a;
        object = em0_2.b;
        object = ms0_1.m((es0_2)object2, (CoroutineContext)object);
        object2 = new CcApiRepo$submitCallMeBackDetail$$inlined$map$1((es0_2)object);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object2, (CoroutineContext)object);
    }
}

