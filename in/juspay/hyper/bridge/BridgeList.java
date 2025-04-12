/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 */
package in.juspay.hyper.bridge;

import in.juspay.hyper.bridge.HBridge;
import in.juspay.hyper.bridge.HyperBridge;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

public final class BridgeList
implements HBridge {
    private final Map bridgeList;

    public BridgeList() {
        LinkedHashMap linkedHashMap;
        this.bridgeList = linkedHashMap = new LinkedHashMap();
    }

    public final void addHyperBridge(HyperBridge hyperBridge) {
        Intrinsics.checkNotNullParameter(hyperBridge, "bridge");
        Map map2 = this.bridgeList;
        String string2 = hyperBridge.getInterfaceName();
        map2.put(string2, hyperBridge);
    }

    public final String getBridgeKeys() {
        Collection collection = this.bridgeList.keySet();
        Object object = new JSONArray(collection);
        object = object.toString();
        Intrinsics.checkNotNullExpressionValue(object, "JSONArray(bridgeList.keys).toString()");
        return object;
    }

    public final Map getBridgeList() {
        return this.bridgeList;
    }

    public String getInterfaceName() {
        String string2 = "BridgeList";
        Intrinsics.checkNotNullExpressionValue(string2, "javaClass.simpleName");
        return string2;
    }
}

