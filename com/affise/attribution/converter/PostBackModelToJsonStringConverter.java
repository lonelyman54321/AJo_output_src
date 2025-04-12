/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.affise.attribution.converter;

import com.affise.attribution.converter.Converter;
import com.affise.attribution.converter.PostBackModelToJsonStringConverter$Companion;
import com.affise.attribution.events.SerializedEvent;
import com.affise.attribution.logs.SerializedLog;
import com.affise.attribution.network.entity.PostBackModel;
import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.usecase.IndexUseCase;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;
import org.json.JSONArray;
import org.json.JSONObject;

public final class PostBackModelToJsonStringConverter
implements Converter {
    public static final PostBackModelToJsonStringConverter$Companion Companion;
    private static final String EVENTS_KEY = "events";
    private static final String INTERNAL_EVENTS_KEY = "internal_events";
    private static final String METRICS_EVENTS_KEY = "metrics_events";
    private static final String SDK_EVENTS_KEY = "sdk_events";
    private static final String UUID_INDEX_KEY = "uuid_index";
    private final IndexUseCase indexUseCase;

    static {
        PostBackModelToJsonStringConverter$Companion postBackModelToJsonStringConverter$Companion;
        Companion = postBackModelToJsonStringConverter$Companion = new PostBackModelToJsonStringConverter$Companion(null);
    }

    public PostBackModelToJsonStringConverter(IndexUseCase indexUseCase2) {
        Intrinsics.checkNotNullParameter(indexUseCase2, "indexUseCase");
        this.indexUseCase = indexUseCase2;
    }

    private final JSONObject parameters(PostBackModel iterator) {
        int n3;
        String string2;
        Object object;
        int n4;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = ((PostBackModel)((Object)iterator)).getParameters().entrySet().iterator();
        while ((n4 = jSONArray.hasNext()) != 0) {
            object = jSONArray.next();
            string2 = ((ProviderType)((Object)object.getKey())).getProvider();
            object = object.getValue();
            jSONObject.put(string2, object);
        }
        long l2 = this.indexUseCase.getUuidIndex();
        string2 = UUID_INDEX_KEY;
        jSONObject.put(string2, l2);
        jSONArray = new JSONArray();
        object = ((PostBackModel)((Object)iterator)).getEvents();
        if (object != null) {
            object = ((Iterable)object).iterator();
            while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                string2 = ((SerializedEvent)object.next()).getData();
                jSONArray.put((Object)string2);
            }
        }
        n3 = jSONArray.length();
        jSONObject.put("affise_events_count", n3);
        jSONObject.put(EVENTS_KEY, (Object)jSONArray);
        jSONArray = new JSONArray();
        object = ((PostBackModel)((Object)iterator)).getInternalEvents();
        if (object != null) {
            object = ((Iterable)object).iterator();
            while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                string2 = ((SerializedEvent)object.next()).getData();
                jSONArray.put((Object)string2);
            }
        }
        n3 = jSONArray.length();
        jSONObject.put("affise_internal_events_count", n3);
        jSONObject.put(INTERNAL_EVENTS_KEY, (Object)jSONArray);
        jSONArray = new JSONArray();
        object = ((PostBackModel)((Object)iterator)).getLogs();
        if (object != null) {
            object = ((Iterable)object).iterator();
            while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                string2 = ((SerializedLog)object.next()).getData();
                jSONArray.put((Object)string2);
            }
        }
        n3 = jSONArray.length();
        jSONObject.put("affise_sdk_events_count", n3);
        object = SDK_EVENTS_KEY;
        jSONObject.put((String)object, (Object)jSONArray);
        jSONArray = new JSONArray();
        iterator = ((PostBackModel)((Object)iterator)).getMetrics();
        if (iterator != null) {
            iterator = ((Iterable)((Object)iterator)).iterator();
            while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                object = ((SerializedEvent)iterator.next()).getData();
                jSONArray.put(object);
            }
        }
        n4 = jSONArray.length();
        jSONObject.put("affise_metrics_events_count", n4);
        jSONObject.put(METRICS_EVENTS_KEY, (Object)jSONArray);
        return jSONObject;
    }

    public String convert(List object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "from");
        JSONArray jSONArray = new JSONArray();
        object = ((Iterable)object).iterator();
        while (bl2 = object.hasNext()) {
            PostBackModel postBackModel = (PostBackModel)object.next();
            postBackModel = this.parameters(postBackModel);
            jSONArray.put((Object)postBackModel);
        }
        object = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(object, "jsonArray\n            .toString()");
        return b.n((String)object, "\\/", "/", false);
    }
}

