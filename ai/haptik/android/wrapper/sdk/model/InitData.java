/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package ai.haptik.android.wrapper.sdk.model;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class InitData {
    private String base_url;
    private boolean botType;
    private String businessId;
    private String clientId;
    private String composerPlaceholder;
    private String customCss;
    private long customCssTTL;
    private boolean enableTypingSuggestions;
    private boolean enableUserFeedback;
    private boolean handleLink;
    private boolean hideComposer;
    private boolean ignoreStorage;
    private String initializeLanguage;
    private final JSONObject jsonObject;
    private boolean locallyDownloadCustomCSS;
    private boolean noCross;
    private boolean noHeader;
    private boolean noLoader;
    private String primaryColor;
    private String privacyPolicyUrl;
    private boolean skipSignupChatHistory;
    private String tabletBgColor;
    private boolean typography;
    private String uniqueChatIdentifier;
    private boolean voiceBotInitialInput;

    public InitData() {
        Object object;
        this.jsonObject = object = new JSONObject();
        object = "";
        this.primaryColor = object;
        this.privacyPolicyUrl = object;
        this.initializeLanguage = object;
        this.businessId = object;
        this.clientId = object;
        this.composerPlaceholder = object;
        this.customCss = object;
        this.customCssTTL = 1440L;
        this.base_url = object;
        this.uniqueChatIdentifier = object;
        this.tabletBgColor = object;
    }

    public final String getBase_url() {
        return this.base_url;
    }

    public final boolean getBotType() {
        return this.botType;
    }

    public final String getBusinessId() {
        return this.businessId;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final String getComposerPlaceholder() {
        return this.composerPlaceholder;
    }

    public final String getCustomCss() {
        return this.customCss;
    }

    public final long getCustomCssTTL() {
        return this.customCssTTL;
    }

    public final boolean getEnableTypingSuggestions() {
        return this.enableTypingSuggestions;
    }

    public final boolean getEnableUserFeedback() {
        return this.enableUserFeedback;
    }

    public final boolean getHandleLink() {
        return this.handleLink;
    }

    public final boolean getHideComposer() {
        return this.hideComposer;
    }

    public final boolean getIgnoreStorage() {
        return this.ignoreStorage;
    }

    public final String getInitializeLanguage() {
        return this.initializeLanguage;
    }

    public final JSONObject getJsonObject$sdk_release() {
        return this.jsonObject;
    }

    public final boolean getLocallyDownloadCustomCSS() {
        return this.locallyDownloadCustomCSS;
    }

    public final boolean getNoCross() {
        return this.noCross;
    }

    public final boolean getNoHeader() {
        return this.noHeader;
    }

    public final boolean getNoLoader() {
        return this.noLoader;
    }

    public final String getPrimaryColor() {
        return this.primaryColor;
    }

    public final String getPrivacyPolicyUrl() {
        return this.privacyPolicyUrl;
    }

    public final boolean getSkipSignupChatHistory() {
        return this.skipSignupChatHistory;
    }

    public final String getTabletBgColor() {
        return this.tabletBgColor;
    }

    public final boolean getTypography() {
        return this.typography;
    }

    public final String getUniqueChatIdentifier() {
        return this.uniqueChatIdentifier;
    }

    public final boolean getVoiceBotInitialInput() {
        return this.voiceBotInitialInput;
    }

    public final void setBase_url(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        this.jsonObject.put("base-url", (Object)string2);
    }

    public final void setBotType(boolean bl2) {
        this.jsonObject.put("bot-type", bl2);
    }

    public final void setBusinessId(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        this.jsonObject.put("business-id", (Object)string2);
    }

    public final void setClientId(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        this.jsonObject.put("client-id", (Object)string2);
    }

    public final void setComposerPlaceholder(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        this.jsonObject.put("composer-placeholder", (Object)string2);
    }

    public final void setCustomCss(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        this.jsonObject.put("custom-css", (Object)string2);
    }

    public final void setCustomCssTTL(long l2) {
        this.jsonObject.put("custom-css-ttl", l2);
    }

    public final void setEnableTypingSuggestions(boolean bl2) {
        this.jsonObject.put("enable-typing-suggestions", bl2);
    }

    public final void setEnableUserFeedback(boolean bl2) {
        this.jsonObject.put("enable-user-feedback", bl2);
    }

    public final void setHandleLink(boolean bl2) {
        this.handleLink = bl2;
    }

    public final void setHideComposer(boolean bl2) {
        this.jsonObject.put("hide-composer", bl2);
    }

    public final void setIgnoreStorage(boolean bl2) {
        this.jsonObject.put("ignore-storage", bl2);
    }

    public final void setInitializeLanguage(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        this.jsonObject.put("initialize-language", (Object)string2);
    }

    public final void setLocallyDownloadCustomCSS(boolean bl2) {
        this.jsonObject.put("locally-download-custom-css", bl2);
    }

    public final void setNoCross(boolean bl2) {
        this.jsonObject.put("no-cross", bl2);
    }

    public final void setNoHeader(boolean bl2) {
        this.jsonObject.put("no-header", bl2);
    }

    public final void setNoLoader(boolean bl2) {
        this.jsonObject.put("no-loader", bl2);
    }

    public final void setPrimaryColor(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        this.jsonObject.put("primary-color", (Object)string2);
    }

    public final void setPrivacyPolicyUrl(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        this.jsonObject.put("privacy-policy-url", (Object)string2);
    }

    public final void setSkipSignupChatHistory(boolean bl2) {
        this.jsonObject.put("skip-signup-chat-history", bl2);
    }

    public final void setTabletBgColor(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        this.jsonObject.put("tablet-bg-color", (Object)string2);
    }

    public final void setTypography(boolean bl2) {
        this.jsonObject.put("typography", bl2);
    }

    public final void setUniqueChatIdentifier(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        this.jsonObject.put("unique-chat-identifier", (Object)string2);
    }

    public final void setVoiceBotInitialInput(boolean bl2) {
        this.jsonObject.put("voice-bot-initial-input", bl2);
    }
}

