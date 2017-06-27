package com.microsoft.mysearch.qa.xpathbuilder;

import com.google.common.collect.LinkedListMultimap;

import com.microsoft.mysearch.qa.util.xpathbuilder.*;
import com.microsoft.mysearch.qa.util.xpathbuilder.enums.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

import static com.microsoft.mysearch.qa.util.xpathbuilder.IXPath.*;
import static com.microsoft.mysearch.qa.util.xpathbuilder.IXPath.getXPath_DirectSibling;

public class XPathBuilderTest {

    private static final Log log = LogFactory.getLog(XPathBuilderTest.class.getName());

    @Test
    public void test0() throws Exception {

        String xpath = getXPath(ELEMENTS.A, ACTIONS.AND_CONTAINS, ATTRIBUTES.CLASS, new XPathValues("dialog", "titlebar", "close")) + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.SPAN, ACTIONS.EQUALS, ATTRIBUTES.TEXT, "close");
        System.out.println("$x(\"" + xpath + "\")");

    }

    @Test
    public void test1() {


        LinkedHashMap<String, String> originalXPathMap = new LinkedHashMap<String, String>(){{
            put("ELECTRON_APP_HANDLER_XPATH", "//body");
            put("CHANNEL_LOADING_SPINNER_XPATH" , "//div[contains(@class, 'app-loading')]");
            put("CHANNEL_MESSAGE_LIST_XPATH" , "//virtual-repeat[contains(@class, 'ts-message-list')]");
            put("SPACES_LOGIN_USE_ANOTHER_ACCOUNT_ID" , "use_another_account");
            put("SPACES_LOGIN_USERNAME_ID" , "cred_userid_inputtext");
            put("SPACES_LOGIN_PASSWORD_ID" , "cred_password_inputtext");
            put("SPACES_LOGIN_SUBMIT_ID" , "cred_sign_in_button");
            put("SPACES_USER_INFO_ELEM_XPATH" , "//div[@data-tid = 'userInformation']");
            put("SPACES_OPTIONS_DROPDOWN_BUTTON_ID" , "personDropdown");
            put("SPACES_OPTIONS_DROPDOWN_BUTTON_XPATH" , "//footer/button[@id='personDropdown']");
            put("SPACES_LOGOUT_BUTTON_ID" , "logout-button");
            put("CALLING_NOT_SUPPORTED_MESG" , "This feature is coming and will be available real soon");
            put("SYNC_FAIL_MSG" , "Failed to sync content. Please refresh to try again.");
            put("ACCESS_CONTENT_FAIL_MSG" , "We cannot access your content. Please refrest to try again.");
            put("MSFT_LOG_IN_WITH_USERNAME_AND_PASSWORD_LINK_XPATH" , "//p[.='Sign in with a username and password instead']");
            put("MSFT_LOG_IN_WITH_USERNAME_AND_PASSWORD_LINK_XPATH_MORE_ACCURATE" , "//p[text()='Sign in with a username and password instead']");
            put("MSFT_LOGIN_PASSWORD_ID" , "passwordInput");
            put("MSFT_LOGIN_BUTTON_ID" , "submitButton");
            put("SHOW_MORE_TEAMS_BUTTON_XPATH" , "//a[@data-tid='team-overflow-moreBtn']");
            put("CALL_NOTIFICATION_WINDOW_XPATH" , "//div[contains(@class= 'notification')]");
            put("CALL_NOTIFICATION_WINDOW_IS_CALLING_MESG_XPATH" , "//div[contains(@class, 'subtitle')][contains(text(), 'is calling you')]");
            put("CALL_NOTIFICATION_WINDOW_IS_NUDGING_MESG_XPATH" , "//div[contains(@class, 'subtitle') and contains(., 'wants you to join a meeting')]");
            put("CALL_NOTIFICATION_ACCEPT_CALL_VIDEO_BUTTON_XPATH" , "//div[contains(@class, 'call-video')]");
            put("CALL_NOTIFICATION_ACCEPT_CALL_AUDIO_BUTTON_XPATH" , "//div[contains(@class, 'call-audio')]");
            put("CALL_NOTIFICATION_REJECT_CALL_BUTTON_XPATH" , "//div[contains(@class, 'call-reject')]");
            put("CALL_NOTIFICATION_JUMP_IN_CALL_BUTTON_XPATH" , "//div[contains(@class, 'jumpin')]");
            put("CALL_NOTIFICATION_CHAT_CALL_BUTTON_XPATH" , "//div[contains(@class, 'chat')]");
            put("CHAT_SEARCH_INPUT_XPATH" , "//div[@data-tid = 'left-rail-2']//input[@id = 'searchInput']");
            put("CHAT_SEARCH_BUTTON_XPATH" , "//div[@data-tid = 'left-rail-2']//button[@data-tid = 'searchBtn']");
            put("CHAT_CREATE_CHAT_BTN_XPATH" , "//button[@data-tid = 'lr-create-chat-2']");
            put("CHAT_SEARCH_PEOPLE_TAB_XPATH" , "//search//span[. = 'People']");
            put("CHAT_LINK_XPATH_TEMPLATE" , "//individual-search-category-people//div/div[. = '%s']/..");
            put("CHAT_USERNAME_HEADER_XPATH_TEMPLATE" , "//chat-header//*[@pl-upn = '%s']");
            put("CHAT_VIDEO_CALL_START_BUTTON_XPATH" , "//calling-start-button[@with-video = 'true']/button");
            put("CHAT_AUDIO_CALL_START_BUTTON_XPATH" , "//calling-start-button[not(@with-video) or @with-video = 'false']/button");
            put("CHAT_VIDEO_CALL_JOIN_BUTTON_XPATH" , "//calling-join-button[not(@audio-only) or @audio-only = 'false']/button");
            put("CHAT_AUDIO_CALL_JOIN_BUTTON_XPATH" , "//calling-join-button[@audio-only = 'true']/button");
            put("CHAT_VIDEO_CALL_REJECT_BUTTON_XPATH" , "//calling-reject-button/button");
            put("CALL_1_1_PARTICIPANT_ANIMATION_XPATH_TEMPLATE" , "//calling-animation-outgoing//img[@pl-upn = '%s']");
            put("CALL_1_1_JOIN_ERROR_STATE_XPATH" , "//div[contains(@class, 'state-description-title')]");
            put("CHAT_ADD_PARTICIPANT_BUTTON_XPATH" , "//chat-header//button[@data-tid = 'lr-create-group-chat']");
            put("CHAT_PEOPLE_PICKER_INPUT_XPATH" , "//div[@data-tid = 'createNewChat']//chat-people-picker//input");
            put("CHAT_CREATE_NEW_INPUT_XPATH" , "//chat-people-picker[@data-tid = 'mp-to-line']//input");
            put("CHAT_USER_CHOOSER_XPATH" , "//div[@data-tid = 'peoplepicker-dropdown']//div[contains(@class, 'result-image')]");
            put("CHAT_ADD_USER_BUTTON_XPATH" , "//div[@data-tid = 'createNewChat']//button[@data-tid = 'createChat-AddMembers']");
            put("CHAT_GROUP_HEADER_XPATH_TEMPLATE" , "//chat-header//span[@pl-upn = '%s']");
            put("CHAT_RECENTS_ACTIVE_CALL_XPATH" , "//div[@data-tid = 'left-rail-2']//active-calls-counter/span");
            put("CHANNEL_CONVERSATION_URL_TEMPLATE" , "channel/%(team_name)s/%(channel_name)s/%(channel_thread_id)s/conversations?ctx=channel");
            put("CHANNEL_CONVERSATION_TITLE_TEMPLATE" , "//h2[@data-tid = 'messagesHeader-Title' and . = '%s']");
            put("CHANNEL_CONVERSATION_CALL_START_BUTTON_XPATH" , "//div[@data-tid = 'messageEditor']//button[contains(@class, 'icons-call')]");
            put("CHANNEL_CONVERSATION_CALL_TITLE_INPUT_XPATH" , "//div[contains(@class, 'title-container')]/input[contains(@class, 'title')]");
            put("CHANNEL_CONVERSATION_NEW_CALL_START_BUTTON_XPATH" , "//calling-start-button-rectangular/button");
            put("CHANNEL_CONVERSATION_JUMP_IN_BUTTON_MOST_RECENT_XPATH" , "//calling-thread-header//calling-join-button[last()]/button");
            put("CHANNEL_CONVERSATION_JUMP_IN_BUTTON_FOR_INITIATOR_SPECIFIED_XPATH_TEMPLATE" , "//calling-thread-header//calling-live-roster/div/img[@pl-upn = '%s']/../../../../calling-join-button/button");
            put("CHANNEL_CONVERSATION_MEETUP_TITLE_FOR_INITIATOR_SPECIFIED_XPATH_TEMPLATE" , "//calling-thread-header//calling-live-roster/div/img[@pl-upn = '%s']/../../../div/div[contains(@class, 'title')]");
            put("CHANNEL_PERSISTENT_INDICATOR_JUMP_IN_BUTTON_XPATH" , "//calling-persistent-indicator//div[contains(@title, '%s')]/../..//calling-join-button/button");
            put("CHANNEL_CONVERSATION_AVATAR_IN_CALLING_HEADER_ROSTER_XPATH_TEMPLATE" , "//calling-thread-header//calling-live-roster/div/img[@pl-upn = '%s']/../img[@pl-upn]");
            put("CHANNEL_CONVERSATION_CALL_MONITOR_XPATH" , "//calling-monitor/div[contains(@class, 'ts-show-cursor')]");
            put("CHANNEL_CONVERSATION_MEETUP_ENDED_XPATH_TEMPLATE" , "(//div[contains(@class, 'ts-message-list-item')]//img[@pl-upn = '%s'])[last()]/../../../div[contains(., '%s')]");
            put("CHANNEL_CONVERSATION_MEETUP_ENDED_MESG" , "ended:");
            put("CHANNEL_PERSISTENT_INDICATOR_MORE_BUTTON_XPATH" , "//calling-persistent-indicator//a[contains(@class, 'toggle-button')]");
            put("CALLING_SCREEN_XPATH" , "//calling-screen");
            put("CALLING_SCREEN_PARTICIPANT_AVATAR_XPATH_TEMPLATE" , "//calling-participant-stream//img[@pl-upn = '%s']");
            put("CALLING_SCREEN_GROUP_CALL_PARTICIPANT_AVATAR_XPATH_TEMPLATE" , "//calling-stage//calling-participant-stream//img[@pl-upn = '%s']");
            put("CALLING_SCREEN_PARTICIPANT_AVATAR_XPATH_ENTRY" , "//calling-participant-stream//img[@pl-upn]");
            put("CALLING_SCREEN_GROUP_CALL_PARTICIPANT_AVATAR_XPATH_ENTRY" , "//calling-stage//calling-participant-stream//img[@pl-upn]");
            put("CALLING_SCREEN_PARTICIPANT_SHARING_SCREEN_AVATAR_XPATH_TEMPLATE" , "//div[contains(@class, 'PRESENTATION')]//calling-stage//calling-participant-stream//img[@pl-upn = '%s']");
            put("CALLING_SCREEN_SHARE_DESKTOP_PANEL_XPATH" , "//div[contains(@class, 'ts-calling-screensharing-panel')]");
            put("CALLING_SCREEN_SHARE_DESKTOP_PANEL_SCREEN_XPATH" , "//div[contains(@class, 'ts-calling-screensharing-panel')]//div[contains(@class, 'screen')]");
            put("CALLING_SCREEN_HANGUP_BUTTON_XPATH" , "//button[contains(@class, 'ts-hangup')]");
            put("CALLING_SCREEN_SHARE_DESKTOP_BUTTON_XPATH" , "//button[contains(@class, 'share-desktop')]");
            put("CALLING_SCREEN_PARTICIPANT_STREAM_XPATH" , "//calling-participant-stream"   );
            put("CALLING_SCREEN_TOGGLE_VIDEO_BUTTON_XPATH" , "//button[contains(@title, 'video')]");
            put("CALLING_SCREEN_MEETUP_TITLE_XPATH" , "//editable-text//div[contains(@class, 'title')]");
            put("CALLING_SCREEN_MEETUP_TITLE_INPUT_XPATH" , "//editable-text//input"   );
            put("CALLING_SCREEN_MEETUP_TITLE_SAVE_XPATH" , "//span[@title = 'Save title']" );
            put("CALLING_MYSELF_VIDEO_XPATH" , "//calling-myself-video//canvas[@width]"  );
            put("CALLING_MYSELF_AVATAR_XPATH" , "//calling-myself-video/div[contains(@class, 'audioOnly')]");
            put("CALLING_SCREEN_TOGGLE_CHAT_ENABLED_XPATH" , "//button[not(@disabled) and contains(@class, 'toggle-chat')]");
            put("CALLING_SCREEN_ADD_PARTICIPANT_BUTTON_XPATH" , "//button[not(@disabled) and contains(@class, 'toggle-roster')]");
            put("CALLING_SCREEN_IN_CHAT_PANE_XPATH" , "//context-message-pane"   );
            put("CALLING_SCREEN_MESSAGE_EDITOR_XPATH" , "//div[@data-tid = 'messageEditor']" );
            put("CALLING_SCREEN_MESSAGES_PANE_TEXT_XPATH_TEMPLATE" , "//div[@data-tid = 'messageBodyContent']//div[contains(text(), '%s')]");
            put("CALLING_SCREEN_MESSAGE_INPUT_CSS" , ".ts-add-message .cke_contents div.cke_reset"   );
            put("CALLING_SCREEN_ADD_PARTICIPANT_PANE_XPATH" , "//calling-roster"   );
            put("CALLING_SCREEN_INVITE_INPUT_XPATH" , "//calling-roster-search//input[@id = 'searchInput']" );
            put("CALLING_SCREEN_SEARCH_RESULT_USER_XPATH_TEMPLATE" , "//calling-roster-search-results//img[@pl-upn = '%s']" );
            put("CALLING_SCREEN_USER_CONNECTING_XPATH_TEMPLATE" , "//calling-roster-section//div[contains(@class, 'roster_list_title')]/..//img[@pl-upn = '%s']" );
            put("CHAT_LIST_XPATH" , "//chat-list"   );
            put("CHANNEL_LIST_XPATH" , "//channel-list"   );
            put("GENERAL_CHAT_FOR_1ST_TEAM" , "//channel-list//a[contains(@title, 'General')]");
            put("APP_BAR_CHAT_BUTTON_XPATH" , "//app-bar//button[@data-tid = 'app-bar-2']" );
            put("APP_BAR_TEAMS_BUTTON_XPATH" , "//app-bar//button[@data-tid = 'app-bar-3']" );
            put("CALLING_HEADER_MENU_XPATH" , "//calling-header//button[contains(@title, 'Toggle sidebar')]");
            put("LEFT_RAIL_USER_INFO_XPATH" , "//user-information/div[contains(@class, 'app-user-information')]");
            put("CALL_HANGING_UP_XPATH" , "//div[contains(@class, 'call-state-layer')]");
            put("FIND_ELEMENT_BY_XPATH_JS_TEMPLATE" , "var elem = document.evaluate(\"%s\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;"  );
            put("SCROLL_DOWN_ELEMENT_JS" , "elem.scrollTop = elem.scrollHeight;"  );
            put("SCROLL_UP_ELEMENT_JS" , "elem.scrollTop = 0;"  );
            put("LOGOUT_EXE_ANGULAR_JS" , "angular.element(document.body).injector().get('authenticationService').logOut();");
            put("CALL_HANGUP_EXE_ANGULAR_JS" , "angular.element(document.body).injector().get('callingService').callRegistry.calls[0].stop();");
            put("CALL_STOP_VIDEO_EXE_ANGULAR_JS" , "angular.element(document.body).injector().get('callingService').callRegistry.calls[0].stopVideo();");
            put("CALL_START_VIDEO_EXE_ANGULAR_JS" , "angular.element(document.body).injector().get('callingService').callRegistry.calls[0].startVideo();");
            put("TOGGLE_CALLING_HEADER_MENU_JS" , "document.evaluate(\"%s\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.click();");
            put("TYPE_TEXT_TO_XPATH_ELEMENT_JS_TEMPLATE" , "document.evaluate(\"%s\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.value = '%s';");
        }};

        LinkedHashMap<String, String> newXPathMap = new LinkedHashMap<String, String>(){
            {
                put("ELECTRON_APP_HANDLER_XPATH", getXPath(doubleSlash, body));
                put("CHANNEL_LOADING_SPINNER_XPATH", getXPath(div, contains, class_att, "app-loading"));
                put("CHANNEL_MESSAGE_LIST_XPATH", getXPath(virtualRepeat, contains, class_att, "ts-message-list"));
                put("SPACES_USER_INFO_ELEM_XPATH", getXPath(div, equals, dataTid, "userInformation"));
                put("SPACES_OPTIONS_DROPDOWN_BUTTON_XPATH", getXPath(footer) + getXPath(singleSlash, button, equals, id, "personDropdown"));
                put("MSFT_LOG_IN_WITH_USERNAME_AND_PASSWORD_LINK_XPATH", getXPath(p, equals, any_att, "Sign in with a username and password instead"));
                put("MSFT_LOG_IN_WITH_USERNAME_AND_PASSWORD_LINK_XPATH_MORE_ACCURATE", getXPath(p, equals, text, "Sign in with a username and password instead"));
                put("SHOW_MORE_TEAMS_BUTTON_XPATH", getXPath(a, equals, dataTid, "team-overflow-moreBtn"));
                put("CALL_NOTIFICATION_WINDOW_XPATH", getXPath(div, contains, class_att, "notification"));
                put("CALL_NOTIFICATION_WINDOW_IS_CALLING_MESG_XPATH", getXPath(div, contains, class_att, "subtitle") + getXPath(contains, text, "is calling you"));
                put("CALL_NOTIFICATION_WINDOW_IS_NUDGING_MESG_XPATH", getXPath(div, contains, class_att, "subtitle") + getXPath(contains, text, "wants you to join a meeting"));
                put("CALL_NOTIFICATION_ACCEPT_CALL_VIDEO_BUTTON_XPATH", getXPath(div, contains, class_att, "call-video"));
                put("CALL_NOTIFICATION_ACCEPT_CALL_AUDIO_BUTTON_XPATH", getXPath(div, contains, class_att, "call-audio"));
                put("CALL_NOTIFICATION_REJECT_CALL_BUTTON_XPATH", getXPath_DivContainsClass("call-reject"));
                put("CALL_NOTIFICATION_JUMP_IN_CALL_BUTTON_XPATH", getXPath_DivContainsClass("jumpin"));
                put("CALL_NOTIFICATION_CHAT_CALL_BUTTON_XPATH", getXPath_DivContainsClass("chat"));
                put("CHAT_SEARCH_INPUT_XPATH", getXPath(div, equals, dataTid, "left-rail-2") + getXPath(input, equals, id, "searchInput"));
                put("CHAT_SEARCH_BUTTON_XPATH", getXPath(div, equals, dataTid, "left-rail-2") + getXPath(button, equals, dataTid, "searchBtn"));
                put("CHAT_CREATE_CHAT_BTN_XPATH", getXPath(button, equals, dataTid, "lr-create-chat-2"));
                put("CHAT_SEARCH_PEOPLE_TAB_XPATH", getXPath(search) + getXPath(span, equals, text, "People"));
                put("CHAT_LINK_XPATH_TEMPLATE", getXPath(individualSearch) + getXPath(div) + getXPath(singleSlash, div, equals, text, "%s") + "/..");                                                 //individual-search-category-people//div/div[. = '%s']/.."
                put("CHAT_USERNAME_HEADER_XPATH_TEMPLATE", getXPath(chatHeader) + getXPath(any, equals, plUpn, "%s"));
                put("CHAT_VIDEO_CALL_START_BUTTON_XPATH", getXPath(callingStartButton, equals, withVideo, "true") + getXPath_DirectSibling(button)); //calling-start-button[@with-video = 'true']/button");
                put("CHAT_AUDIO_CALL_START_BUTTON_XPATH", "//calling-start-button[not(@with-video) or @with-video = 'false']/button");
                put("CHAT_VIDEO_CALL_JOIN_BUTTON_XPATH", "//calling-join-button[not(@audio-only) or @audio-only = 'false']/button");
                put("CHAT_AUDIO_CALL_JOIN_BUTTON_XPATH", "//calling-join-button[@audio-only = 'true']/button");
                put("CHAT_VIDEO_CALL_REJECT_BUTTON_XPATH", "//calling-reject-button/button");
                put("CALL_1_1_PARTICIPANT_ANIMATION_XPATH_TEMPLATE", "//calling-animation-outgoing//img[@pl-upn = '%s']");
                put("CALL_1_1_JOIN_ERROR_STATE_XPATH", "//div[contains(@class, 'state-description-title')]");
                put("CHAT_ADD_PARTICIPANT_BUTTON_XPATH", "//chat-header//button[@data-tid = 'lr-create-group-chat']");
                put("CHAT_PEOPLE_PICKER_INPUT_XPATH", "//div[@data-tid = 'createNewChat']//chat-people-picker//input");
                put("CHAT_CREATE_NEW_INPUT_XPATH", "//chat-people-picker[@data-tid = 'mp-to-line']//input");
                put("CHAT_USER_CHOOSER_XPATH", "//div[@data-tid = 'peoplepicker-dropdown']//div[contains(@class, 'result-image')]");
                put("CHAT_ADD_USER_BUTTON_XPATH", "//div[@data-tid = 'createNewChat']//button[@data-tid = 'createChat-AddMembers']");
                put("CHAT_GROUP_HEADER_XPATH_TEMPLATE", "//chat-header//span[@pl-upn = '%s']");
                put("CHAT_RECENTS_ACTIVE_CALL_XPATH", "//div[@data-tid = 'left-rail-2']//active-calls-counter/span");
                put("CHANNEL_CONVERSATION_URL_TEMPLATE", "channel/%(team_name)s/%(channel_name)s/%(channel_thread_id)s/conversations?ctx=channel");
                put("CHANNEL_CONVERSATION_TITLE_TEMPLATE", "//h2[@data-tid = 'messagesHeader-Title' and . = '%s']");
                put("CHANNEL_CONVERSATION_CALL_START_BUTTON_XPATH", "//div[@data-tid = 'messageEditor']//button[contains(@class, 'icons-call')]");
                put("CHANNEL_CONVERSATION_CALL_TITLE_INPUT_XPATH", "//div[contains(@class, 'title-container')]/input[contains(@class, 'title')]");
                put("CHANNEL_CONVERSATION_NEW_CALL_START_BUTTON_XPATH", "//calling-start-button-rectangular/button");
                put("CHANNEL_CONVERSATION_JUMP_IN_BUTTON_MOST_RECENT_XPATH", "//calling-thread-header//calling-join-button[last()]/button");
                put("CHANNEL_CONVERSATION_JUMP_IN_BUTTON_FOR_INITIATOR_SPECIFIED_XPATH_TEMPLATE", "//calling-thread-header//calling-live-roster/div/img[@pl-upn = '%s']/../../../../calling-join-button/button");
                put("CHANNEL_CONVERSATION_MEETUP_TITLE_FOR_INITIATOR_SPECIFIED_XPATH_TEMPLATE", "//calling-thread-header//calling-live-roster/div/img[@pl-upn = '%s']/../../../div/div[contains(@class, 'title')]");
                put("CHANNEL_PERSISTENT_INDICATOR_JUMP_IN_BUTTON_XPATH", "//calling-persistent-indicator//div[contains(@title, '%s')]/../..//calling-join-button/button");
                put("CHANNEL_CONVERSATION_AVATAR_IN_CALLING_HEADER_ROSTER_XPATH_TEMPLATE", "//calling-thread-header//calling-live-roster/div/img[@pl-upn = '%s']/../img[@pl-upn]");
                put("CHANNEL_CONVERSATION_CALL_MONITOR_XPATH", "//calling-monitor/div[contains(@class, 'ts-show-cursor')]");
                put("CHANNEL_CONVERSATION_MEETUP_ENDED_XPATH_TEMPLATE", "(//div[contains(@class, 'ts-message-list-item')]//img[@pl-upn = '%s'])[last()]/../../../div[contains(., '%s')]");
                put("CHANNEL_CONVERSATION_MEETUP_ENDED_MESG", "ended:");
                put("CHANNEL_PERSISTENT_INDICATOR_MORE_BUTTON_XPATH", "//calling-persistent-indicator//a[contains(@class, 'toggle-button')]");
                put("CALLING_SCREEN_XPATH", "//calling-screen");
                put("CALLING_SCREEN_PARTICIPANT_AVATAR_XPATH_TEMPLATE", "//calling-participant-stream//img[@pl-upn = '%s']");
                put("CALLING_SCREEN_GROUP_CALL_PARTICIPANT_AVATAR_XPATH_TEMPLATE", "//calling-stage//calling-participant-stream//img[@pl-upn = '%s']");
                put("CALLING_SCREEN_PARTICIPANT_AVATAR_XPATH_ENTRY", "//calling-participant-stream//img[@pl-upn]");
                put("CALLING_SCREEN_GROUP_CALL_PARTICIPANT_AVATAR_XPATH_ENTRY", "//calling-stage//calling-participant-stream//img[@pl-upn]");
                put("CALLING_SCREEN_PARTICIPANT_SHARING_SCREEN_AVATAR_XPATH_TEMPLATE", "//div[contains(@class, 'PRESENTATION')]//calling-stage//calling-participant-stream//img[@pl-upn = '%s']");
                put("CALLING_SCREEN_SHARE_DESKTOP_PANEL_XPATH", "//div[contains(@class, 'ts-calling-screensharing-panel')]");
                put("CALLING_SCREEN_SHARE_DESKTOP_PANEL_SCREEN_XPATH", "//div[contains(@class, 'ts-calling-screensharing-panel')]//div[contains(@class, 'screen')]");
                put("CALLING_SCREEN_HANGUP_BUTTON_XPATH", "//button[contains(@class, 'ts-hangup')]");
                put("CALLING_SCREEN_SHARE_DESKTOP_BUTTON_XPATH", "//button[contains(@class, 'share-desktop')]");
                put("CALLING_SCREEN_PARTICIPANT_STREAM_XPATH", "//calling-participant-stream");
                put("CALLING_SCREEN_TOGGLE_VIDEO_BUTTON_XPATH", "//button[contains(@title, 'video')]");
                put("CALLING_SCREEN_MEETUP_TITLE_XPATH", "//editable-text//div[contains(@class, 'title')]");
                put("CALLING_SCREEN_MEETUP_TITLE_INPUT_XPATH", "//editable-text//input");
                put("CALLING_SCREEN_MEETUP_TITLE_SAVE_XPATH", "//span[@title = 'Save title']");
                put("CALLING_MYSELF_VIDEO_XPATH", "//calling-myself-video//canvas[@width]");
                put("CALLING_MYSELF_AVATAR_XPATH", "//calling-myself-video/div[contains(@class, 'audioOnly')]");
                put("CALLING_SCREEN_TOGGLE_CHAT_ENABLED_XPATH", "//button[not(@disabled) and contains(@class, 'toggle-chat')]");
                put("CALLING_SCREEN_ADD_PARTICIPANT_BUTTON_XPATH", "//button[not(@disabled) and contains(@class, 'toggle-roster')]");
                put("CALLING_SCREEN_IN_CHAT_PANE_XPATH", "//context-message-pane");
                put("CALLING_SCREEN_MESSAGE_EDITOR_XPATH", "//div[@data-tid = 'messageEditor']");
                put("CALLING_SCREEN_MESSAGES_PANE_TEXT_XPATH_TEMPLATE", "//div[@data-tid = 'messageBodyContent']//div[contains(text(), '%s')]");
                put("CALLING_SCREEN_MESSAGE_INPUT_CSS", ".ts-add-message .cke_contents div.cke_reset");
                put("CALLING_SCREEN_ADD_PARTICIPANT_PANE_XPATH", "//calling-roster");
                put("CALLING_SCREEN_INVITE_INPUT_XPATH", "//calling-roster-search//input[@id = 'searchInput']");
                put("CALLING_SCREEN_SEARCH_RESULT_USER_XPATH_TEMPLATE", "//calling-roster-search-results//img[@pl-upn = '%s']");
                put("CALLING_SCREEN_USER_CONNECTING_XPATH_TEMPLATE", "//calling-roster-section//div[contains(@class, 'roster_list_title')]/..//img[@pl-upn = '%s']");
                put("CHAT_LIST_XPATH", "//chat-list");
                put("CHANNEL_LIST_XPATH", "//channel-list");
                put("GENERAL_CHAT_FOR_1ST_TEAM", "//channel-list//a[contains(@title, 'General')]");
                put("APP_BAR_CHAT_BUTTON_XPATH", "//app-bar//button[@data-tid = 'app-bar-2']");
                put("APP_BAR_TEAMS_BUTTON_XPATH", "//app-bar//button[@data-tid = 'app-bar-3']");
                put("CALLING_HEADER_MENU_XPATH", "//calling-header//button[contains(@title, 'Toggle sidebar')]");
                put("LEFT_RAIL_USER_INFO_XPATH", "//user-information/div[contains(@class, 'app-user-information')]");
                put("CALL_HANGING_UP_XPATH", "//div[contains(@class, 'call-state-layer')]");
                put("FIND_ELEMENT_BY_XPATH_JS_TEMPLATE", "var elem = document.evaluate(\"%s\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;");
                put("SCROLL_DOWN_ELEMENT_JS", "elem.scrollTop = elem.scrollHeight;");
                put("SCROLL_UP_ELEMENT_JS", "elem.scrollTop = 0;");
                put("LOGOUT_EXE_ANGULAR_JS", "angular.element(document.body).injector().get('authenticationService').logOut();");
                put("CALL_HANGUP_EXE_ANGULAR_JS", "angular.element(document.body).injector().get('callingService').callRegistry.calls[0].stop();");
                put("CALL_STOP_VIDEO_EXE_ANGULAR_JS", "angular.element(document.body).injector().get('callingService').callRegistry.calls[0].stopVideo();");
                put("CALL_START_VIDEO_EXE_ANGULAR_JS", "angular.element(document.body).injector().get('callingService').callRegistry.calls[0].startVideo();");
                put("TOGGLE_CALLING_HEADER_MENU_JS", "document.evaluate(\"%s\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.click();");
                put("TYPE_TEXT_TO_XPATH_ELEMENT_JS_TEMPLATE", "document.evaluate(\"%s\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.value = '%s';");
            }};



    }

    @Test
    public void test2() {

    }

    @Test
    public void test3() {

    }

    @Test
    public void test4() {

    }

    @Test
    public void test5() {

        /** This selector shows limitation of current XPath class element adding [in this case is shown how during addEntry is not single_slash and element.div added into class recognized as same entries so each have its, own xpath.... /div[contains(@class,'pnl')]/div[not(contains(@class,'collapsed')] ] */

        String xpath = getXPath_DivEqualsDataPath("pnlAddSource pnlAccNam txtAccountName") + getXPath_HasADescendantSpanEqualsText("(optional)") + getXPath_HasADescendantLabelEqualsText("Account name") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.INPUT, ACTIONS.CONTAINS, ATTRIBUTES.WICKETPATH, "txtAccountName");
        System.out.println("$x(\"" + xpath + "\")");

        xpath = getXPath_DivEqualsDataPath("pnlAddSource pnlStatementDate txtStatementDate") + getXPath_HasADescendantSpanEqualsText("(optional)") + getXPath_HasADescendantLabelEqualsText("Statement date") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.INPUT, ACTIONS.CONTAINS, ATTRIBUTES.WICKETPATH, "txtStatementDate");
        System.out.println("$x(\"" + xpath + "\")");

        xpath = getXPath_DivEqualsDataPath("pnlNoAccount lnkAuto") + getXPath_DirectSibling(ELEMENTS.A);
        System.out.println("$x(\"" + xpath + "\")");

        xpath = getXPath_DivEqualsDataPath("pnlBasicInfo pnlYodleeIframe") + getXPath(ELEMENTS.DIV, ACTIONS.CONTAINS, ATTRIBUTES.WICKETPATH, "pnlYodleeIframe") + getXPath_HasADescendantSpanEqualsText("Start Scraping") + getXPath(ELEMENTS.A, ACTIONS.AND_CONTAINS, ATTRIBUTES.CLASS, new XPathValues(new LinkedList<String>() {{
            add("start");
            add("apply");
            add("content");
            add("control");
            add("submit");
        }}));
        System.out.println("$x(\"" + xpath + "\")");

        xpath = getXPath(ELEMENTS.A, ACTIONS.AND_CONTAINS, ATTRIBUTES.CLASS, new XPathValues("dialog", "titlebar", "close")) + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.SPAN, ACTIONS.EQUALS, ATTRIBUTES.TEXT, "close");
        System.out.println("$x(\"" + xpath + "\")");
        String xpath2 = new XPath(ELEMENTS.A, ACTIONS.AND_CONTAINS, ATTRIBUTES.CLASS, new XPathValues("dialog", "titlebar", "close")).addEntry(PREFIX.SINGLE_SLASH, ELEMENTS.SPAN, ACTIONS.EQUALS, ATTRIBUTES.TEXT, "close").getXPath();
        Assert.assertEquals("Strings should be the same!", xpath, xpath2);


        xpath = getXPath_HasADescendant(ELEMENTS.SPAN, ACTIONS.AND_CONTAINS, ATTRIBUTES.TEXT, new XPathValues("I", "m done"));
        System.out.println("$x(\"" + xpath + "\")");
        xpath2 = getXPath_HasADescendant(ELEMENTS.SPAN, ACTIONS.AND_CONTAINS, ATTRIBUTES.TEXT, new XPathValues("I", "m done"));
        System.out.println(xpath2);
        Assert.assertEquals("Strings should be the same!", xpath, xpath2);


        xpath = getXPath_HasADescendant(ELEMENTS.SPAN, ACTIONS.AND_CONTAINS, ATTRIBUTES.TEXT, IXPath.setXPathValues("I", "m done"));
        System.out.println("$x(\"" + xpath + "\")");
        Assert.assertEquals("Strings should be the same!", xpath, xpath2);


        xpath = new XPath(ELEMENTS.DIV, ACTIONS.CONTAINS, ATTRIBUTES.ID, "pnlDeposit").addEntry(ELEMENTS.DIV, ACTIONS.CONTAINS, ATTRIBUTES.ID, "Type").getXPath() + getXPath(ELEMENTS.SPAN);
        System.out.println("$x(\"" + xpath + "\")");
        xpath2 = "//div[contains(@id,'pnlDeposit')]//div[contains(@id,'Type')]//span";
        Assert.assertEquals("Strings should be the same!", xpath, xpath2);


        xpath = new XPath(ELEMENTS.DIV, ACTIONS.CONTAINS, ATTRIBUTES.ID, "pnlDeposit").addEntry(ELEMENTS.A, ACTIONS.CONTAINS, ATTRIBUTES.WICKETPATH, "lnkDelete").getXPath();
        System.out.println("$x(\"" + xpath + "\")");
        xpath2 = "//div[contains(@id,'pnlDeposit')]//a[contains(@wicketpath,'lnkDelete')]";
        Assert.assertEquals("Strings should be the same!", xpath, xpath2);


        xpath = getXPath(ELEMENTS.A, ACTIONS.AND_CONTAINS, ATTRIBUTES.WICKETPATH, new XPathValues("dialogWrapper", "pnlAddSource", "btnAddThisSource_submit"));
        System.out.println("$x(\"" + xpath + "\")");
        xpath2 = "//a[contains(@wicketpath,'dialogWrapper') and contains(@wicketpath,'pnlAddSource') and contains(@wicketpath,'btnAddThisSource_submit')]";
        Assert.assertEquals("Strings should be the same!", xpath2, xpath);


        xpath = new XPath(ELEMENTS.DIV, ACTIONS.OR_EQUALS, ATTRIBUTES.DATA_PATH, new XPathValues("pnlNoAccount lnkCurrent", "pnlNoAccount lnkSavings", "pnlNoAccount lnkAuto")).getXPath() + getXPath_DirectSibling(ELEMENTS.A);
        System.out.println("$x(\"" + xpath + "\")");
        xpath2 = "//div[@data-path='pnlNoAccount lnkCurrent' or @data-path='pnlNoAccount lnkSavings' or @data-path='pnlNoAccount lnkAuto']/a";
        Assert.assertEquals("Strings should be the same!", xpath, xpath2);

        xpath2 = getXPath(ELEMENTS.DIV, ACTIONS.OR_EQUALS, ATTRIBUTES.DATA_PATH, new XPathValues("pnlNoAccount lnkCurrent", "pnlNoAccount lnkSavings", "pnlNoAccount lnkAuto")) + getXPath_DirectSibling(ELEMENTS.A);
        Assert.assertEquals("Strings should be the same!", xpath, xpath2);


        xpath = getXPath(ELEMENTS.DIV, ACTIONS.EQUALS, ATTRIBUTES.ROLE, "dialog") + getXPath(ELEMENTS.DIV, ACTIONS.CONTAINS, ATTRIBUTES.ID, "dialogWrapper") + getXPath_DivEqualsDataPath("root");
        System.out.println("$x(\"" + xpath + "\")");
        xpath2 = "//div[@role='dialog']//div[contains(@id,'dialogWrapper')]//div[@data-path='root']";
        Assert.assertEquals("Strings should be the same!", xpath, xpath2);

        xpath2 = new XPath(ELEMENTS.DIV, ACTIONS.EQUALS, ATTRIBUTES.ROLE, "dialog").getXPath() + new XPath(ELEMENTS.DIV, ACTIONS.CONTAINS, ATTRIBUTES.ID, "dialogWrapper").getXPath() + getXPath_DivEqualsDataPath("root");
        Assert.assertEquals("Strings should be the same!", xpath, xpath2);

        xpath = new XPath(ELEMENTS.DIV, ACTIONS.EQUALS, ATTRIBUTES.ROLE, "dialog").addEntry(ELEMENTS.DIV, ACTIONS.CONTAINS, ATTRIBUTES.ID, "dialogWrapper").getXPath() + getXPath_DivEqualsDataPath("root");
        Assert.assertEquals("Strings should be the same!", xpath, xpath2);

        xpath = new XPath(ELEMENTS.DIV, ACTIONS.OR_EQUALS, ATTRIBUTES.DATA_PATH, new XPathValues(new LinkedList<String>(){{add("pnlNoAccount lnkCurrent");add("pnlNoAccount lnkSavings"); add("pnlNoAccount lnkAuto"); add("pnlNoAccount hbxAuto lnkAutoYodlee");}})).getXPath() + getXPath_DirectSibling(ELEMENTS.A);
        System.out.println("$x(\"" + xpath + "\")");
        xpath2 = "//div[@data-path='pnlNoAccount lnkCurrent' or @data-path='pnlNoAccount lnkSavings' or @data-path='pnlNoAccount lnkAuto' or @data-path='pnlNoAccount hbxAuto lnkAutoYodlee']/a";
        Assert.assertEquals("Strings should be the same!", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlBasicInfo pnlYodleeIframe") + getXPath(ELEMENTS.DIV, ACTIONS.CONTAINS, ATTRIBUTES.WICKETPATH, "pnlYodleeIframe") + getXPath_HasADescendantSpanEqualsText("Start Scraping") +
                getXPath(ELEMENTS.A, ACTIONS.AND_CONTAINS, ATTRIBUTES.CLASS, new XPathValues(new LinkedList<String>()
                {
            {
                add("start");
                add("apply");
                add("content");
                add("control");
                add("submit");
            }
                }
                ));
        System.out.println("$x(\"" + xpath + "\")"); 
        xpath2 = "//div[@data-path='pnlBasicInfo pnlYodleeIframe']//div[contains(@wicketpath,'pnlYodleeIframe')][//span[text()='Start Scraping']]//a[contains(@class,'start') and contains(@class,'apply') and contains(@class,'content') and contains(@class,'control') and contains(@class,'submit')]";
        Assert.assertEquals("Strings should be the same!", xpath, xpath2);

        LinkedListMultimap<ATTRIBUTES, XPathValues> attributes = new XPathAttributes(ATTRIBUTES.WICKETPATH, "main_c_title").addEntryToMultimap(ATTRIBUTES.TEXT, "Your accounts").get();
        LinkedListMultimap<XPathElement, LinkedList<ACTIONS>> elements = new XPathActionsElements(new XPathElement(PREFIX.DOUBLE_SLASH, ELEMENTS.H2), ACTIONS.EQUALS).getElementActionsMap();

        xpath = new XPath(elements, attributes).getXPath();
        System.out.println("$x(\"" + xpath + "\")"); 

        xpath2 = "//h2[@wicketpath='main_c_title'][text()='Your accounts']";
        Assert.assertEquals("Strings should be the same!", xpath, xpath2);

//        xpath = XPath.addEntryElementActionsAttributesValues(new XPath(elements, attributes), new XPathActionsElements(new XPathElement(PREFIX.DOUBLE_SLASH, ELEMENTS.H2), ACTIONS.EQUALS), new XPathAttributes(ATTRIBUTES.WICKETPATH, "main_c_title").addEntryToMultimap(ATTRIBUTES.TEXT, "Your accounts")).getXPath();
//        System.out.println("$x(\"" + xpath + "\")");
//        //todo bug this should not be twice the same selector but //h2[@wicketpath='main_c_title'][text()='Your accounts'][text()='Your accounts'] just once.
//        Assert.assertEquals("Strings should be the same!", xpath, xpath2 + xpath2);

        xpath = getXPath(ACTIONS.EQUALS, ATTRIBUTES.CLASS, "checked");
        System.out.println("$x(\"" + xpath + "\")"); 
        xpath2 = "[@class='checked']";
        Assert.assertEquals("Strings should be the same!", xpath, xpath2);

        xpath = new XPath(elements, attributes).getXPath() + getXPath(ACTIONS.NOT_EQUALS, ATTRIBUTES.CLASS, "checked");
        System.out.println("$x(\"" + xpath + "\")"); 
        xpath2 = "//h2[@wicketpath='main_c_title'][text()='Your accounts'][not(@class='checked')]";
        Assert.assertEquals("Strings should be the same!", xpath, xpath2);


        xpath = getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.DIV, ACTIONS.CONTAINS, ATTRIBUTES.DATA_PATH, "pnlApplicationList rptApplication") + getXPath(ACTIONS.CONTAINS, ATTRIBUTES.DATA_PATH, "pnlApplication btnStart") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.A, ACTIONS.CONTAINS, ATTRIBUTES.WICKETPATH, "btnStart_submit");
        System.out.println("$x(\"" + xpath + "\")");
        xpath2 = "/div[contains(@data-path,'pnlApplicationList rptApplication')][contains(@data-path,'pnlApplication btnStart')]/a[contains(@wicketpath,'btnStart_submit')]";
        Assert.assertEquals("Strings should be the same!", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlSort lnk-sortby-creationdate") + getXPath_ContainsWicketpath(PREFIX.SINGLE_SLASH, ELEMENTS.A, "sortby-creationdate_submit") + getXPath_HasADescendantSpanEqualsText("stage submission date");
        System.out.println("$x(\"" + xpath + "\")");
        xpath2 = "//div[@data-path='pnlSort lnk-sortby-creationdate']/a[contains(@wicketpath,'sortby-creationdate_submit')][//span[text()='stage submission date']]";
        Assert.assertEquals("Failed not the same", xpath2, xpath);

        xpath = getXPath_DivEqualsDataPath("pnlSort lnk-order-asc") + getXPath_DirectSibling(ELEMENTS.A);
        System.out.println("$x(\"" + xpath + "\")");
        xpath2 = "//div[@data-path='pnlSort lnk-order-asc']/a";
        Assert.assertEquals("Failed not the same", xpath2, xpath);

        xpath =  getXPath_DivEqualsDataPath("pnlSort lnk-order-desc") + getXPath_DirectSibling(ELEMENTS.A);
        System.out.println("$x(\"" + xpath + "\")");
        xpath2 = "//div[@data-path='pnlSort lnk-order-desc']/a";
        Assert.assertEquals("Failed not the same", xpath2, xpath);

        xpath = getXPath(ELEMENTS.DIV, ACTIONS.EQUALS, ATTRIBUTES.WICKETPATH, "multiFlow_panels_4") + getXPath(ELEMENTS.SPAN, ACTIONS.EQUALS, ATTRIBUTES.WICKETPATH, "multiFlow_panels_4_title") + getXPath(ACTIONS.CONTAINS, ATTRIBUTES.TEXT, "Documents");
        System.out.println("$x(\"" + xpath + "\")");
        xpath2 = "//div[@wicketpath='multiFlow_panels_4']//span[@wicketpath='multiFlow_panels_4_title'][contains(text(),'Documents')]";
        Assert.assertEquals("Failed not the same", xpath2, xpath);

        xpath = getXPath_DivEqualsDataPath("pnlSort lnk-sortby-submissiondate") + getXPath_ContainsWicketpath(PREFIX.SINGLE_SLASH, ELEMENTS.A, "sortby-submissiondate_submit") + getXPath_HasADescendantSpanEqualsText("creation date");
        System.out.println("$x(\"" + xpath + "\")");
        xpath2 = "//div[@data-path='pnlSort lnk-sortby-submissiondate']/a[contains(@wicketpath,'sortby-submissiondate_submit')][//span[text()='creation date']]";
        Assert.assertEquals("Failed not the same", xpath2, xpath);

        xpath = getXPath_DivEqualsDataPath("txaComment") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.TEXTAREA, ACTIONS.CONTAINS, ATTRIBUTES.WICKETPATH, "txaComment_textarea");

        xpath = getXPath_DivEqualsDataPath("btnSave") + getXPath_HasADescendantSpanEqualsText("Save") + getXPath_DirectAButtonContainsWicketpath("btnSave_submit") + getXPath_HasADescendantSpanEqualsText("Save");

        xpath = getXPath_DivEqualsDataPath("btnCancel") + getXPath_HasADescendantSpanEqualsText("Cancel") + getXPath_DirectAButtonContainsWicketpath("btnCancel_cancel") + getXPath_HasADescendantSpanEqualsText("Cancel");

        xpath = getXPath_DivEqualsDataPath("btnAddItem") + getXPath_HasADescendantSpanEqualsText("Add item") + getXPath_DirectAButtonContainsWicketpath("btnAddItem_dialog") + getXPath_HasADescendantSpanEqualsText("Add item");

        int indexNumber = 2;
        int number = indexNumber - 1;

        String dataPath = "rptDocuments " + number + " pnlDocuments lnkDetail";
        String wicketPath = "multiFlow_panels_4_p_c_form_form_root_c_w_rptDocuments_c_rows_" + indexNumber + "_item_pnlDocuments_c_w_lnkDetail_submit";

        xpath = getXPath(ELEMENTS.DIV, ACTIONS.EQUALS, ATTRIBUTES.DATA_PATH, dataPath) + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.A, ACTIONS.EQUALS, ATTRIBUTES.WICKETPATH, wicketPath);
        System.out.println(xpath);
        Assert.assertEquals("Are not the same!", xpath, "//div[@data-path='rptDocuments 1 pnlDocuments lnkDetail']/a[@wicketpath='multiFlow_panels_4_p_c_form_form_root_c_w_rptDocuments_c_rows_2_item_pnlDocuments_c_w_lnkDetail_submit']");

        String WORKFLOW_TAB = getXPath(ELEMENTS.DIV, ACTIONS.EQUALS, ATTRIBUTES.WICKETPATH, "multiFlow_panels_0");
        System.out.println("WORKFLOW_TAB ---> $x(\"" + WORKFLOW_TAB + "\")");

        String WORKFLOW_PANEL_TITLE = WORKFLOW_TAB + getXPath(ELEMENTS.SPAN, ACTIONS.EQUALS, ATTRIBUTES.WICKETPATH, "multiFlow_panels_0_header_title") + getXPath(ACTIONS.CONTAINS, ATTRIBUTES.TEXT, "Workflow");
        System.out.println("WORKFLOW_PANEL_TITLE ---> $x(\"" + WORKFLOW_PANEL_TITLE + "\")");

        String WORKFLOW_PANEL_HIDE = WORKFLOW_TAB + getXPath(ELEMENTS.A, ACTIONS.EQUALS, ATTRIBUTES.CLASS, "collapse");
        System.out.println("WORKFLOW_PANEL_HIDE ---> $x(\"" + WORKFLOW_PANEL_HIDE + "\")");

        String WORKFLOW_PANEL_HIDDEN = WORKFLOW_PANEL_HIDE + getXPath(ACTIONS.CONTAINS, ATTRIBUTES.STYLE, "display: none");
        System.out.println("WORKFLOW_PANEL_HIDDEN ---> $x(\"" + WORKFLOW_PANEL_HIDDEN + "\")");

        String WORKFLOW_PANEL_NOT_HIDDEN = WORKFLOW_PANEL_HIDE + getXPath(ACTIONS.NOT_CONTAINS, ATTRIBUTES.STYLE, "display: none");
        System.out.println("WORKFLOW_PANEL_NOT_HIDDEN ---> $x(\"" + WORKFLOW_PANEL_NOT_HIDDEN + "\")");

        String FINANCE_TOOL_TAB =               getXPath(ELEMENTS.DIV, ACTIONS.EQUALS, ATTRIBUTES.WICKETPATH, "multiFlow_panels_1");
        System.out.println("FINANCE_TOOL_TAB ---> $x(\"" + FINANCE_TOOL_TAB + "\")");

        String FINANCE_TOOL_TAB_TITLE =         FINANCE_TOOL_TAB + getXPath(ELEMENTS.SPAN, ACTIONS.EQUALS, ATTRIBUTES.WICKETPATH, "multiFlow_panels_1_header_title") + getXPath(ACTIONS.CONTAINS, ATTRIBUTES.TEXT, "Finance Tool");
        System.out.println("FINANCE_TOOL_TAB_TITLE ---> $x(\"" + FINANCE_TOOL_TAB_TITLE + "\")");

        String FINANCE_TOOL_PANEL_HIDE =        FINANCE_TOOL_TAB + getXPath(ELEMENTS.A, ACTIONS.EQUALS, ATTRIBUTES.CLASS, "collapse");
        System.out.println("FINANCE_TOOL_PANEL_HIDE ---> $x(\"" + FINANCE_TOOL_PANEL_HIDE + "\")");

        String FINANCE_TOOL_PANEL_HIDDEN =      FINANCE_TOOL_PANEL_HIDE + getXPath(ACTIONS.CONTAINS, ATTRIBUTES.STYLE, "display: none");
        System.out.println("FINANCE_TOOL_PANEL_HIDDEN ---> $x(\"" + FINANCE_TOOL_PANEL_HIDDEN + "\")");

        String FINANCE_TOOL_PANEL_NOT_HIDDEN =  FINANCE_TOOL_PANEL_HIDE + getXPath(ACTIONS.NOT_CONTAINS, ATTRIBUTES.STYLE, "display: none");
        System.out.println("FINANCE_TOOL_PANEL_NOT_HIDDEN ---> $x(\"" + FINANCE_TOOL_PANEL_NOT_HIDDEN + "\")");

        System.out.println(new XPath(ELEMENTS.DIV, ACTIONS.AND_CONTAINS, ATTRIBUTES.DATA_PATH, new LinkedList<String>(){{add("rptDocuments ");add(" pnlDocuments");}}).getXPath());

        xpath = getXPath_DivEqualsDataPath("pnlBlack pnlInfo lnkEdit") + getXPath_DirectAButtonContainsWicketpath("pnlInfo_c_w_lnkEdit_script");
        System.out.println(xpath);

        xpath = getXPath_DivEqualsDataPath("pnlBlack pnlInfo lnkEdit") + getXPath_DirectAButtonContainsWicketpath("pnlInfo_c_w_lnkEdit_script");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlBlack pnlInfo lnkEdit']/a[contains(@wicketpath,'pnlInfo_c_w_lnkEdit_script')]";
        Assert.assertEquals("Not equals!!", xpath, xpath2);

        xpath = getXPath(ELEMENTS.TD, ACTIONS.EQUALS, ATTRIBUTES.DATA_PATH, "pnlMain pnlManualKYC tblKycTable 0 cmbStatus") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.INPUT, ACTIONS.AND_CONTAINS, ATTRIBUTES.WICKETPATH, new XPathValues("pnlManualKYC", "tblKycTable", "cmbStatus"));
        System.out.println(xpath);
        xpath2 = "//td[@data-path='pnlMain pnlManualKYC tblKycTable 0 cmbStatus']/input[contains(@wicketpath,'pnlManualKYC') and contains(@wicketpath,'tblKycTable') and contains(@wicketpath,'cmbStatus')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlMain pnlManualKYC btnManualSave") + getXPath_DirectAButtonContainsWicketpath("pnlManualKYC_c_w_btnManualSave_submit") + getXPath_HasADescendantSpanEqualsText("Save");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlMain pnlManualKYC btnManualSave']/a[contains(@wicketpath,'pnlManualKYC_c_w_btnManualSave_submit')][//span[text()='Save']]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlSetFico");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlSetFico']";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlSetFico lblNazev") + getXPath_HasADescendantSpanEqualsText("Set FICO");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlSetFico lblNazev'][//span[text()='Set FICO']]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlSetFico txtFico") + getXPath_HasADescendant(ELEMENTS.LABEL, ACTIONS.EQUALS, ATTRIBUTES.TEXT, "FICO") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.INPUT, ACTIONS.CONTAINS, ATTRIBUTES.WICKETPATH, "pnlSetFico_c_w_txtFico");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlSetFico txtFico'][//label[text()='FICO']]/input[contains(@wicketpath,'pnlSetFico_c_w_txtFico')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlSetFico txtExternalId") + getXPath_HasADescendant(ELEMENTS.LABEL, ACTIONS.CONTAINS, ATTRIBUTES.TEXT, "Ticket Id") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.INPUT, ACTIONS.CONTAINS, ATTRIBUTES.WICKETPATH, "pnlSetFico_c_w_txtExternalId");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlSetFico txtExternalId'][//label[contains(text(),'Ticket Id')]]/input[contains(@wicketpath,'pnlSetFico_c_w_txtExternalId')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlSetFico txaDescription") + getXPath_HasADescendant(ELEMENTS.LABEL, ACTIONS.CONTAINS, ATTRIBUTES.TEXT, "Comment") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.TEXTAREA, ACTIONS.CONTAINS, ATTRIBUTES.WICKETPATH, "pnlSetFico_c_w_txaDescription_textarea");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlSetFico txaDescription'][//label[contains(text(),'Comment')]]/textarea[contains(@wicketpath,'pnlSetFico_c_w_txaDescription_textarea')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlSetFico btnSave") + getXPath_DirectAButtonContainsWicketpath("pnlSetFico_c_w_btnSave_submit") + getXPath_HasADescendantSpanEqualsText("Save");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlSetFico btnSave']/a[contains(@wicketpath,'pnlSetFico_c_w_btnSave_submit')][//span[text()='Save']]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlSetFico btnCancel") + getXPath_DirectAButtonContainsWicketpath("pnlSetFico_c_w_btnCancel_cancel") + getXPath_HasADescendantSpanEqualsText("Cancel");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlSetFico btnCancel']/a[contains(@wicketpath,'pnlSetFico_c_w_btnCancel_cancel')][//span[text()='Cancel']]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlAml cmbValue") + getXPath_HasADescendantLabelEqualsText("AML") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.INPUT, ACTIONS.CONTAINS, ATTRIBUTES.WICKETPATH, "pnlAml_c_w_cmbValue");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlAml cmbValue'][//label[text()='AML']]/input[contains(@wicketpath,'pnlAml_c_w_cmbValue')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlAml txtTicketId") + getXPath_HasADescendant(ELEMENTS.LABEL, ACTIONS.CONTAINS, ATTRIBUTES.TEXT, "Ticket Id") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.INPUT, ACTIONS.CONTAINS, ATTRIBUTES.WICKETPATH, "pnlAml_c_w_txtTicketId");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlAml txtTicketId'][//label[contains(text(),'Ticket Id')]]/input[contains(@wicketpath,'pnlAml_c_w_txtTicketId')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlAml txaDescription") + getXPath_HasADescendant(ELEMENTS.LABEL, ACTIONS.CONTAINS, ATTRIBUTES.TEXT, "Comment") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.TEXTAREA, ACTIONS.CONTAINS, ATTRIBUTES.WICKETPATH, "txaDescription_textarea");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlAml txaDescription'][//label[contains(text(),'Comment')]]/textarea[contains(@wicketpath,'txaDescription_textarea')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlAml btnSave") + getXPath_DirectAButtonContainsWicketpath("pnlAml_c_w_btnSave_submit") + getXPath_HasADescendantSpanEqualsText("Save");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlAml btnSave']/a[contains(@wicketpath,'pnlAml_c_w_btnSave_submit')][//span[text()='Save']]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlAml btnCancel") + getXPath_DirectAButtonContainsWicketpath("pnlAml_c_w_btnCancel_cancel") + getXPath_HasADescendantSpanEqualsText("Cancel");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlAml btnCancel']/a[contains(@wicketpath,'pnlAml_c_w_btnCancel_cancel')][//span[text()='Cancel']]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlAml");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlAml']";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlFraud");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlFraud']";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlFraud lblFraud") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.DIV, ACTIONS.CONTAINS, ATTRIBUTES.WICKETPATH, "pnlFraud_c_w_lblFraud") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.SPAN, ACTIONS.EQUALS, ATTRIBUTES.TEXT, "Set Fraud");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlFraud lblFraud']/div[contains(@wicketpath,'pnlFraud_c_w_lblFraud')]/span[text()='Set Fraud']";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlFraud cmbFraud") + getXPath_HasADescendantLabelEqualsText("Fraud") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.INPUT, ACTIONS.CONTAINS, ATTRIBUTES.WICKETPATH, "pnlFraud_c_w_cmbFraud");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlFraud cmbFraud'][//label[text()='Fraud']]/input[contains(@wicketpath,'pnlFraud_c_w_cmbFraud')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlFraud txtTiketId") + getXPath_HasADescendant(ELEMENTS.LABEL, ACTIONS.CONTAINS, ATTRIBUTES.TEXT, "Ticket Id") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.INPUT, ACTIONS.CONTAINS, ATTRIBUTES.WICKETPATH, "pnlFraud_c_w_txtTiketId");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlFraud txtTiketId'][//label[contains(text(),'Ticket Id')]]/input[contains(@wicketpath,'pnlFraud_c_w_txtTiketId')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlFraud txaDescription") + getXPath_HasADescendant(ELEMENTS.LABEL, ACTIONS.CONTAINS, ATTRIBUTES.TEXT, "Comment") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.TEXTAREA, ACTIONS.CONTAINS, ATTRIBUTES.WICKETPATH, "pnlFraud_c_w_txaDescription_textarea");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlFraud txaDescription'][//label[contains(text(),'Comment')]]/textarea[contains(@wicketpath,'pnlFraud_c_w_txaDescription_textarea')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlFraud btnCancel") + getXPath_DirectAButtonContainsWicketpath("pnlFraud_c_w_btnCancel_cancel") + getXPath_HasADescendantSpanEqualsText("Cancel");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlFraud btnCancel']/a[contains(@wicketpath,'pnlFraud_c_w_btnCancel_cancel')][//span[text()='Cancel']]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlFraud btnSave") + getXPath_DirectAButtonContainsWicketpath("pnlFraud_c_w_btnSave_submit") + getXPath_HasADescendantSpanEqualsText("Save");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlFraud btnSave']/a[contains(@wicketpath,'pnlFraud_c_w_btnSave_submit')][//span[text()='Save']]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlRepeatCustomer");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlRepeatCustomer']";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlRepeatCustomer lblRepeatCustomer") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.DIV, ACTIONS.CONTAINS, ATTRIBUTES.WICKETPATH, "pnlRepeatCustomer_c_w_lblRepeatCustomer") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.SPAN, ACTIONS.EQUALS, ATTRIBUTES.TEXT, "Repeat Customer");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlRepeatCustomer lblRepeatCustomer']/div[contains(@wicketpath,'pnlRepeatCustomer_c_w_lblRepeatCustomer')]/span[text()='Repeat Customer']";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlRepeatCustomer txtRepeatCustomer") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.INPUT, ACTIONS.CONTAINS, ATTRIBUTES.WICKETPATH, "pnlRepeatCustomer_c_w_txtRepeatCustomer");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlRepeatCustomer txtRepeatCustomer']/input[contains(@wicketpath,'pnlRepeatCustomer_c_w_txtRepeatCustomer')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlRepeatCustomer btnCancel") + getXPath_DirectAButtonContainsWicketpath("pnlRepeatCustomer_c_w_btnCancel_cancel") + getXPath_HasADescendantSpanEqualsText("Cancel");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlRepeatCustomer btnCancel']/a[contains(@wicketpath,'pnlRepeatCustomer_c_w_btnCancel_cancel')][//span[text()='Cancel']]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlRepeatCustomer btnSave") + getXPath_DirectAButtonContainsWicketpath("pnlRepeatCustomer_c_w_btnSave_submit") + getXPath_HasADescendantSpanEqualsText("Save");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlRepeatCustomer btnSave']/a[contains(@wicketpath,'pnlRepeatCustomer_c_w_btnSave_submit')][//span[text()='Save']]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlSetScoreOverride lblSetScoreOverride") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.DIV, ACTIONS.CONTAINS, ATTRIBUTES.WICKETPATH, "pnlSetScoreOverride_c_w_lblSetScoreOverride") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.SPAN, ACTIONS.EQUALS, ATTRIBUTES.TEXT, "Set score override");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlSetScoreOverride lblSetScoreOverride']/div[contains(@wicketpath,'pnlSetScoreOverride_c_w_lblSetScoreOverride')]/span[text()='Set score override']";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlSetScoreOverride txtScoreOverride") + getXPath_HasADescendantLabelEqualsText("Value") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.INPUT, ACTIONS.CONTAINS, ATTRIBUTES.WICKETPATH, "pnlSetScoreOverride_c_w_txtScoreOverride");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlSetScoreOverride txtScoreOverride'][//label[text()='Value']]/input[contains(@wicketpath,'pnlSetScoreOverride_c_w_txtScoreOverride')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlSetScoreOverride txaNote") + getXPath_HasADescendantLabelEqualsText("Note") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.TEXTAREA, ACTIONS.CONTAINS, ATTRIBUTES.WICKETPATH, "pnlSetScoreOverride_c_w_txaNote_textarea");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlSetScoreOverride txaNote'][//label[text()='Note']]/textarea[contains(@wicketpath,'pnlSetScoreOverride_c_w_txaNote_textarea')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlSetScoreOverride btnCancel") + getXPath_DirectAButtonContainsWicketpath("pnlSetScoreOverride_c_w_btnCancel_cancel") + getXPath_HasADescendantSpanEqualsText("Cancel");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlSetScoreOverride btnCancel']/a[contains(@wicketpath,'pnlSetScoreOverride_c_w_btnCancel_cancel')][//span[text()='Cancel']]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlSetScoreOverride btnSave") + getXPath_DirectAButtonContainsWicketpath("pnlSetScoreOverride_c_w_btnSave_submit") + getXPath_HasADescendantSpanEqualsText("Save");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlSetScoreOverride btnSave']/a[contains(@wicketpath,'pnlSetScoreOverride_c_w_btnSave_submit')][//span[text()='Save']]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlAddNote lblAddNote") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.DIV, ACTIONS.CONTAINS, ATTRIBUTES.WICKETPATH, "pnlAddNote_c_w_lblAddNote") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.SPAN, ACTIONS.EQUALS, ATTRIBUTES.TEXT, "Add note");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlAddNote lblAddNote']/div[contains(@wicketpath,'pnlAddNote_c_w_lblAddNote')]/span[text()='Add note']";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlAddNote txaNote") + getXPath_HasADescendantLabelContainsText("Note") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.TEXTAREA, ACTIONS.CONTAINS, ATTRIBUTES.WICKETPATH, "pnlAddNote_c_w_txaNote_textarea");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlAddNote txaNote'][//label[contains(text(),'Note')]]/textarea[contains(@wicketpath,'pnlAddNote_c_w_txaNote_textarea')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlAddNote btnCancel") + getXPath_DirectAButtonContainsWicketpath("pnlAddNote_c_w_btnCancel_cancel") + getXPath_HasADescendantSpanEqualsText("Cancel");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlAddNote btnCancel']/a[contains(@wicketpath,'pnlAddNote_c_w_btnCancel_cancel')][//span[text()='Cancel']]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlAddNote btnSave") + getXPath_DirectAButtonContainsWicketpath("pnlAddNote_c_w_btnSave_submit") + getXPath_HasADescendantSpanEqualsText("Save");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlAddNote btnSave']/a[contains(@wicketpath,'pnlAddNote_c_w_btnSave_submit')][//span[text()='Save']]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlMain pnlManualKYC chkKycManualSwitch") + getXPath_HasADescendantLabelEqualsText("Manually update") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.INPUT, ACTIONS.CONTAINS, ATTRIBUTES.WICKETPATH, "pnlManualKYC_c_w_chkKycManualSwitch_checkbox");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlMain pnlManualKYC chkKycManualSwitch'][//label[text()='Manually update']]/input[contains(@wicketpath,'pnlManualKYC_c_w_chkKycManualSwitch_checkbox')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlMain pnlManualKYC chkKycManualSwitch") + getXPath_HasADescendantLabelEqualsText("Manually update") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.SPAN, ACTIONS.CONTAINS, ATTRIBUTES.CLASS, "vcheckbox control") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.A, ACTIONS.EQUALS, ATTRIBUTES.CLASS, "checked");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlMain pnlManualKYC chkKycManualSwitch'][//label[text()='Manually update']]/span[contains(@class,'vcheckbox control')]/a[@class='checked']";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlUnsecuredLoan pnlUnsecuredLoan0 btnContinue0") + getXPath_DirectAButtonContainsWicketpath("pnlUnsecuredLoan0_c_w_btnContinue0_submit") + getXPath_HasADescendantSpanEqualsText("Continue");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlUnsecuredLoan pnlUnsecuredLoan0 btnContinue0']/a[contains(@wicketpath,'pnlUnsecuredLoan0_c_w_btnContinue0_submit')][//span[text()='Continue']]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlDetail pnlSelfEmployed cmbCountry") + getXPath_HasADescendantLabelEqualsText("Country") + getXPath_ContainsWicketpath(ELEMENTS.INPUT, "pnlSelfEmployed_c_w_cmbCountry");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlDetail pnlSelfEmployed cmbCountry'][//label[text()='Country']]//input[contains(@wicketpath,'pnlSelfEmployed_c_w_cmbCountry')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("rptDocuments " + 1 + " pnlDocuments lblStatus") + getXPath(ACTIONS.CONTAINS, ATTRIBUTES.CLASS, "check-icon") + getXPath(ACTIONS.NOT_CONTAINS, ATTRIBUTES.CLASS, "uncheck-icon");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='rptDocuments 1 pnlDocuments lblStatus'][contains(@class,'check-icon')][not(contains(@class,'uncheck-icon'))]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("rptDocuments " + 1 + " pnlDocuments lblStatus") + getXPath(ACTIONS.CONTAINS, ATTRIBUTES.CLASS, "uncheck-icon");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='rptDocuments 1 pnlDocuments lblStatus'][contains(@class,'uncheck-icon')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("rptDocuments " + 1 + " pnlDocuments lblStatus") + getXPath(ACTIONS.CONTAINS, ATTRIBUTES.CLASS, "notset-icon");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='rptDocuments 1 pnlDocuments lblStatus'][contains(@class,'notset-icon')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlBlack pnlEdit cmbDocumentType") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.SELECT, ACTIONS.CONTAINS, ATTRIBUTES.WICKETPATH, "pnlEdit_c_w_cmbDocumentType_combobox") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.OPTION, ACTIONS.EQUALS, ATTRIBUTES.SELECTED, "selected");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlBlack pnlEdit cmbDocumentType']/select[contains(@wicketpath,'pnlEdit_c_w_cmbDocumentType_combobox')]/option[@selected='selected']";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlBlack pnlEdit cmbDocSubtype") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.SELECT, ACTIONS.CONTAINS, ATTRIBUTES.WICKETPATH, "pnlEdit_c_w_cmbDocSubtype_combobox") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.OPTION, ACTIONS.EQUALS, ATTRIBUTES.SELECTED, "selected");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlBlack pnlEdit cmbDocSubtype']/select[contains(@wicketpath,'pnlEdit_c_w_cmbDocSubtype_combobox')]/option[@selected='selected']";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath(ELEMENTS.DIV, ACTIONS.AND_CONTAINS, ATTRIBUTES.DATA_PATH, IXPath.setXPathValues("rptDocuments", "pnlDocuments lnkDetail")) + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.A) + getXPath_HasADescendant(ELEMENTS.SPAN, ACTIONS.EQUALS, ATTRIBUTES.CLASS, "link");
        System.out.println(xpath);
        xpath2 = "//div[contains(@data-path,'rptDocuments') and contains(@data-path,'pnlDocuments lnkDetail')]/a[//span[@class='link']]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath(ELEMENTS.DIV, ACTIONS.AND_CONTAINS, ATTRIBUTES.DATA_PATH, IXPath.setXPathValues("rptDocuments", "pnlDocuments")) + getXPath(ACTIONS.EQUALS, ATTRIBUTES.DATA_TYPE, "panel") + getXPath(ACTIONS.CONTAINS, ATTRIBUTES.CLASS, "clickable") + getXPath_HasADescendant(ELEMENTS.SPAN, ACTIONS.EQUALS, ATTRIBUTES.CLASS, "link") + getXPath(ACTIONS.CONTAINS, ATTRIBUTES.DATA_PATH, "1");
        System.out.println(xpath);
        xpath2 = "//div[contains(@data-path,'rptDocuments') and contains(@data-path,'pnlDocuments')][@data-type='panel'][contains(@class,'clickable')][//span[@class='link']][contains(@data-path,'1')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlStage1 chkCheck1") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.SPAN, ACTIONS.CONTAINS, ATTRIBUTES.CLASS, "vcheckbox control") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.A, ACTIONS.CONTAINS, ATTRIBUTES.ID, "checkbox");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlStage1 chkCheck1']/span[contains(@class,'vcheckbox control')]/a[contains(@id,'checkbox')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlStage1 btnCompleteScript") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.A, ACTIONS.CONTAINS, ATTRIBUTES.WICKETPATH, "pnlStage1_c_w_btnCompleteScript_script") + getXPath_HasADescendantSpanEqualsText("Complete Validation");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlStage1 btnCompleteScript']/a[contains(@wicketpath,'pnlStage1_c_w_btnCompleteScript_script')][//span[text()='Complete Validation']]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath(ELEMENTS.DIV, ACTIONS.OR_CONTAINS, ATTRIBUTES.CLASS, new XPathValues("busy-indicator-big", "busyIndicator", "dblclick-fix-layer")) + getXPath(ACTIONS.CONTAINS, ATTRIBUTES.STYLE, "block") + getXPath(ACTIONS.NOT_CONTAINS, ATTRIBUTES.STYLE, "none");
        System.out.println(xpath);
        xpath2 = "//div[contains(@class,'busy-indicator-big') or contains(@class,'busyIndicator') or contains(@class,'dblclick-fix-layer')][contains(@style,'block')][not(contains(@style,'none'))]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath(ELEMENTS.TD, ACTIONS.EQUALS, ATTRIBUTES.DATA_PATH, "pnlMain pnlManualKYC tblKycTable 0 cmbStatus") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.INPUT, ACTIONS.AND_CONTAINS, ATTRIBUTES.WICKETPATH, new XPathValues("pnlManualKYC", "tblKycTable", "cmbStatus"));
        System.out.println(xpath);
        xpath2 = "//td[@data-path='pnlMain pnlManualKYC tblKycTable 0 cmbStatus']/input[contains(@wicketpath,'pnlManualKYC') and contains(@wicketpath,'tblKycTable') and contains(@wicketpath,'cmbStatus')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlSetScoreOverride txaNote") + getXPath_HasADescendantLabelEqualsText("Note") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.TEXTAREA, ACTIONS.CONTAINS, ATTRIBUTES.WICKETPATH, "pnlSetScoreOverride_c_w_txaNote_textarea");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlSetScoreOverride txaNote'][//label[text()='Note']]/textarea[contains(@wicketpath,'pnlSetScoreOverride_c_w_txaNote_textarea')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlAddNote txaNote") + getXPath_HasADescendantLabelEqualsText("Note") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.TEXTAREA, ACTIONS.CONTAINS, ATTRIBUTES.WICKETPATH, "pnlAddNote_c_w_txaNote_textarea");
        System.out.println(xpath);

        xpath = getXPath_DivEqualsDataPath("pnlMain pnlManualKYC chkKycManualSwitch") + getXPath_HasADescendantLabelEqualsText("Manually update") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.SPAN, ACTIONS.CONTAINS, ATTRIBUTES.CLASS, "vcheckbox control") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.A, ACTIONS.CONTAINS, ATTRIBUTES.ID, "checkbox");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlMain pnlManualKYC chkKycManualSwitch'][//label[text()='Manually update']]/span[contains(@class,'vcheckbox control')]/a[contains(@id,'checkbox')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlStage2") + getXPath_DirectAButtonContainsWicketpath("pnlStage2_label") + getXPath(ACTIONS.EQUALS, ATTRIBUTES.TEXT, "Stage 2: Credit Review");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlStage2']/a[contains(@wicketpath,'pnlStage2_label')][text()='Stage 2: Credit Review']";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath(ELEMENTS.DIV, ACTIONS.EQUALS, ATTRIBUTES.WICKETPATH, "multiFlow_panels_2") + getXPath_DivEqualsDataPath("pnlOfferValuesSysOffer pnlWarningScoreCardNotSetuped lblWarnScoreCardNotSetuped") + getXPath_ContainsWicketpath(ELEMENTS.DIV, "pnlWarningScoreCardNotSetuped_c_w_lblWarnScoreCardNotSetuped") + getXPath_HasADescendantSpanEqualsText("Score card was not fully set-up yet!");
        System.out.println(xpath);
        xpath2 = "//div[@wicketpath='multiFlow_panels_2']//div[@data-path='pnlOfferValuesSysOffer pnlWarningScoreCardNotSetuped lblWarnScoreCardNotSetuped']//div[contains(@wicketpath,'pnlWarningScoreCardNotSetuped_c_w_lblWarnScoreCardNotSetuped')][//span[text()='Score card was not fully set-up yet!']]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath(ELEMENTS.UL, ACTIONS.CONTAINS, ATTRIBUTES.STYLE, "display: block") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.LI, ACTIONS.EQUALS, ATTRIBUTES.CLASS, "ui-menu-item") + getXPath_DirectSibling(ELEMENTS.A);
        System.out.println(xpath);
        xpath2 = "//ul[contains(@style,'display: block')]/li[@class='ui-menu-item']/a";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlMain pnlCoLoanTitle txtTitle") + getXPath_HasADescendantLabelContainsText("Title") + getXPath(ELEMENTS.INPUT, ACTIONS.CONTAINS, ATTRIBUTES.WICKETPATH, "pnlCoLoanTitle_c_w_txtTitle_tb");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlMain pnlCoLoanTitle txtTitle'][//label[contains(text(),'Title')]]//input[contains(@wicketpath,'pnlCoLoanTitle_c_w_txtTitle_tb')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlMain pnlNames txtFirstName") + getXPath_HasADescendantLabelEqualsText("First name") + getXPath_ContainsWicketpath(ELEMENTS.INPUT, "pnlNames_c_w_txtFirstName");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlMain pnlNames txtFirstName'][//label[text()='First name']]//input[contains(@wicketpath,'pnlNames_c_w_txtFirstName')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlMain pnlCoLoanNamesSuff txtMiddleName") + getXPath_HasADescendantLabelContainsText("Middle name") + getXPath_ContainsWicketpath(ELEMENTS.INPUT, "pnlCoLoanNamesSuff_c_w_txtMiddleName");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlMain pnlCoLoanNamesSuff txtMiddleName'][//label[contains(text(),'Middle name')]]//input[contains(@wicketpath,'pnlCoLoanNamesSuff_c_w_txtMiddleName')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlMain pnlNames txtLastName") + getXPath_HasADescendantLabelEqualsText("Last name") + getXPath_ContainsWicketpath(ELEMENTS.INPUT, "pnlNames_c_w_txtLastName");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlMain pnlNames txtLastName'][//label[text()='Last name']]//input[contains(@wicketpath,'pnlNames_c_w_txtLastName')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlMain pnlCoLoanNamesSuff txtSuffix") + getXPath_HasADescendantLabelContainsText("Suffix") + getXPath_ContainsWicketpath(ELEMENTS.INPUT, "pnlCoLoanNamesSuff_c_w_txtSuffix");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlMain pnlCoLoanNamesSuff txtSuffix'][//label[contains(text(),'Suffix')]]//input[contains(@wicketpath,'pnlCoLoanNamesSuff_c_w_txtSuffix')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlMain pnlGender rgrGender radMale") + getXPath_HasADescendantLabelEqualsText("Male") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.SPAN, ACTIONS.EQUALS, ATTRIBUTES.CLASS, "vradiobutton control") + getXPath_DirectSibling(ELEMENTS.A);
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlMain pnlGender rgrGender radMale'][//label[text()='Male']]/span[@class='vradiobutton control']/a";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlMain pnlGender rgrGender radFemale") + getXPath_HasADescendantLabelEqualsText("Female") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.SPAN, ACTIONS.EQUALS, ATTRIBUTES.CLASS, "vradiobutton control") + getXPath_DirectSibling(ELEMENTS.A);
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlMain pnlGender rgrGender radFemale'][//label[text()='Female']]/span[@class='vradiobutton control']/a";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlNoEmplyments pnlPaye lnkAddPaye") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.A, ACTIONS.OR_CONTAINS, ATTRIBUTES.WICKETPATH, new XPathValues("pnlPaye_c_w_lnkAddPaye_dialog", "pnlPaye_c_w_lnkAddPaye_submit"));
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlNoEmplyments pnlPaye lnkAddPaye']/a[contains(@wicketpath,'pnlPaye_c_w_lnkAddPaye_dialog') or contains(@wicketpath,'pnlPaye_c_w_lnkAddPaye_submit')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlDetail pnlEmployed cmbJobTitle") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.INPUT);
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlDetail pnlEmployed cmbJobTitle']/input";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath(ELEMENTS.DIV, ACTIONS.OR_CONTAINS, ATTRIBUTES.CLASS, new XPathValues("busy-indicator-big", "busyIndicator", "dblclick-fix-layer")) + getXPath(ACTIONS.CONTAINS, ATTRIBUTES.STYLE, "block") + getXPath(ACTIONS.NOT_CONTAINS, ATTRIBUTES.STYLE, "none");
        System.out.println(xpath);
        xpath2 = "//div[contains(@class,'busy-indicator-big') or contains(@class,'busyIndicator') or contains(@class,'dblclick-fix-layer')][contains(@style,'block')][not(contains(@style,'none'))]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlDetail pnlSelfEmployed pnlAddressField1") + getXPath(ELEMENTS.DIV, ACTIONS.CONTAINS, ATTRIBUTES.ID, "googlediv") + getXPath_HasADescendantLabelContainsText("Address line 1") + getXPath(PREFIX.DOUBLE_SLASH, ELEMENTS.INPUT);
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlDetail pnlSelfEmployed pnlAddressField1']//div[contains(@id,'googlediv')][//label[contains(text(),'Address line 1')]]//input";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlDetail pnlSelfEmployed txtBusinessEndDate") + getXPath_HasADescendantLabelContainsText("End date") + getXPath_ContainsWicketpath(PREFIX.SINGLE_SLASH, ELEMENTS.INPUT, "pnlSelfEmployed_c_w_txtBusinessEndDate");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlDetail pnlSelfEmployed txtBusinessEndDate'][//label[contains(text(),'End date')]]/input[contains(@wicketpath,'pnlSelfEmployed_c_w_txtBusinessEndDate')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath(ELEMENTS.UL, ACTIONS.CONTAINS, ATTRIBUTES.STYLE, "display: block") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.LI, ACTIONS.EQUALS, ATTRIBUTES.CLASS, "ui-menu-item") + getXPath_DirectSibling(ELEMENTS.A);
        System.out.println(xpath);
        xpath2 = "//ul[contains(@style,'display: block')]/li[@class='ui-menu-item']/a";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlDetail pnlUnemployed txtUnemployedEndDate") + getXPath_HasADescendant(getXPath(ELEMENTS.LABEL, ACTIONS.AND_CONTAINS, ATTRIBUTES.TEXT, "End date")) + getXPath_DirectSibling(ELEMENTS.INPUT);
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlDetail pnlUnemployed txtUnemployedEndDate'][//label[contains(text(),'End date') and contains(text(),'End date')]]/input";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlAccountList btnImDone") + getXPath_DirectAButtonContainsWicketpath("btnImDone_submit") + getXPath_HasADescendant(getXPath(ELEMENTS.SPAN, ACTIONS.CONTAINS, ATTRIBUTES.TEXT, new XPathValues("I", "m done")));
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlAccountList btnImDone']/a[contains(@wicketpath,'btnImDone_submit')][//span[contains(text(),'I')][contains(text(),'m done')]]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlNoLiability lnkAddCreditCard") + getXPath_DirectAButtonContainsOrContainsWicketpath("lnkAddCreditCard_dialog", "lnkAddCreditCard_submit");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlNoLiability lnkAddCreditCard']/a[contains(@wicketpath,'lnkAddCreditCard_dialog') or contains(@wicketpath,'lnkAddCreditCard_submit')]";
        Assert.assertEquals("not equals", xpath, xpath2);


        xpath = getXPath(ELEMENTS.DIV, ACTIONS.OR_CONTAINS, ATTRIBUTES.CLASS, new XPathValues("busy-indicator-big", "busyIndicator", "dblclick-fix-layer")) + getXPath(ACTIONS.CONTAINS, ATTRIBUTES.STYLE, "none") + getXPath(ACTIONS.NOT_CONTAINS, ATTRIBUTES.STYLE, "block");
        System.out.println(xpath);
        xpath2 = "//div[contains(@class,'busy-indicator-big') or contains(@class,'busyIndicator') or contains(@class,'dblclick-fix-layer')][contains(@style,'none')][not(contains(@style,'block'))]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("btnAddLiability") + getXPath_DirectAButtonContainsWicketpath("btnAddLiability_submit") + getXPath_HasADescendantSpanEqualsText("Save and close");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='btnAddLiability']/a[contains(@wicketpath,'btnAddLiability_submit')][//span[text()='Save and close']]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivAndContainsDataPath("pnlNoLiability", "PersonalLoan") + getXPath_DirectAButtonContainsOrContainsWicketpath("PersonalLoan_dialog", "PersonalLoan_submit");
        System.out.println(xpath);
        xpath2 = "//div[contains(@data-path,'pnlNoLiability') and contains(@data-path,'PersonalLoan')]/a[contains(@wicketpath,'PersonalLoan_dialog') or contains(@wicketpath,'PersonalLoan_submit')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivAndContainsDataPath("pnlNoLiability", "CreditCard") + getXPath_DirectAButtonContainsOrContainsWicketpath("AddCreditCard_dialog", "CreditCard_submit");
        System.out.println(xpath);
        xpath2 = "//div[contains(@data-path,'pnlNoLiability') and contains(@data-path,'CreditCard')]/a[contains(@wicketpath,'AddCreditCard_dialog') or contains(@wicketpath,'CreditCard_submit')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivAndContainsDataPath("pnlNoLiability", "MaintenancePayment") + getXPath_DirectAButtonContainsOrContainsWicketpath("MaintenancePayment_dialog", "MaintenancePayment_submit");
        System.out.println(xpath);
        xpath2 = "//div[contains(@data-path,'pnlNoLiability') and contains(@data-path,'MaintenancePayment')]/a[contains(@wicketpath,'MaintenancePayment_dialog') or contains(@wicketpath,'MaintenancePayment_submit')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivAndContainsDataPath("pnlNoLiability", "Other") + getXPath_DirectAButtonContainsOrContainsWicketpath("Other_dialog", "Other_submit");
        System.out.println(xpath);
        xpath2 = "//div[contains(@data-path,'pnlNoLiability') and contains(@data-path,'Other')]/a[contains(@wicketpath,'Other_dialog') or contains(@wicketpath,'Other_submit')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivAndContainsDataPath("pnlNoLiability", "CarLoan") + getXPath_DirectAButtonContainsOrContainsWicketpath("CarLoan_dialog", "CarLoan_submit");
        System.out.println(xpath);
        xpath2 = "//div[contains(@data-path,'pnlNoLiability') and contains(@data-path,'CarLoan')]/a[contains(@wicketpath,'CarLoan_dialog') or contains(@wicketpath,'CarLoan_submit')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivAndContainsDataPath("pnlNoLiability", "StudentLoan") + getXPath_DirectAButtonContainsOrContainsWicketpath("StudentLoan_dialog", "StudentLoan_submit");
        System.out.println(xpath);
        xpath2 = "//div[contains(@data-path,'pnlNoLiability') and contains(@data-path,'StudentLoan')]/a[contains(@wicketpath,'StudentLoan_dialog') or contains(@wicketpath,'StudentLoan_submit')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivAndContainsDataPath("pnlNoLiability", "Rent") + getXPath_DirectAButtonContainsOrContainsWicketpath("Rent_dialog", "Rent_submit");
        System.out.println(xpath);
        xpath2 = "//div[contains(@data-path,'pnlNoLiability') and contains(@data-path,'Rent')]/a[contains(@wicketpath,'Rent_dialog') or contains(@wicketpath,'Rent_submit')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivAndContainsDataPath("pnlNoLiability", "Utilities") + getXPath_DirectAButtonContainsOrContainsWicketpath("Utilities_dialog", "Utilities_submit");
        System.out.println(xpath);
        xpath2 = "//div[contains(@data-path,'pnlNoLiability') and contains(@data-path,'Utilities')]/a[contains(@wicketpath,'Utilities_dialog') or contains(@wicketpath,'Utilities_submit')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivAndContainsDataPath("pnlNoLiability", "Childcare") + getXPath_DirectAButtonContainsOrContainsWicketpath("Childcare_dialog", "Childcare_submit");
        System.out.println(xpath);
        xpath2 = "//div[contains(@data-path,'pnlNoLiability') and contains(@data-path,'Childcare')]/a[contains(@wicketpath,'Childcare_dialog') or contains(@wicketpath,'Childcare_submit')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivAndContainsDataPath("pnlNoLiability", "Mortgage") + getXPath_DirectAButtonContainsOrContainsWicketpath("Mortage_dialog", "Mortgage_submit");
        System.out.println(xpath);
        xpath2 = "//div[contains(@data-path,'pnlNoLiability') and contains(@data-path,'Mortgage')]/a[contains(@wicketpath,'Mortage_dialog') or contains(@wicketpath,'Mortgage_submit')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath(ELEMENTS.DIV, ACTIONS.EQUALS, ATTRIBUTES.WICKETPATH, "multiFlow_panels_4_header") + getXPath_HasADescendant(getXPath(ELEMENTS.A, ACTIONS.CONTAINS, ATTRIBUTES.CLASS, "collapse") + getXPath(ACTIONS.CONTAINS, ATTRIBUTES.STYLE, "display: none"));
        System.out.println(xpath);
        xpath2 = "//div[@wicketpath='multiFlow_panels_4_header'][//a[contains(@class,'collapse')][contains(@style,'display: none')]]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath(ELEMENTS.DIV, ACTIONS.EQUALS, ATTRIBUTES.TITLE, "Documents 1") + getXPath(ACTIONS.NOT_EQUALS, ATTRIBUTES.TITLE, "Documents 2") + getXPath(ACTIONS.EQUALS, ATTRIBUTES.WICKETPATH, "multiFlow_panels_4_header");
        System.out.println(xpath);
        xpath2 = "//div[@title='Documents 1'][not(@title='Documents 2')][@wicketpath='multiFlow_panels_4_header']";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath(ELEMENTS.DIV, ACTIONS.EQUALS, ATTRIBUTES.TITLE, "Documents 2") + getXPath(ACTIONS.NOT_EQUALS, ATTRIBUTES.TITLE, "Documents 1") + getXPath(ACTIONS.EQUALS, ATTRIBUTES.WICKETPATH, "multiFlow_panels_5_header");
        System.out.println(xpath);
        xpath2 = "//div[@title='Documents 2'][not(@title='Documents 1')][@wicketpath='multiFlow_panels_5_header']";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlAddSource pnlAccNam txtAccountName") + getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.INPUT, ACTIONS.CONTAINS, ATTRIBUTES.WICKETPATH, "pnlAccNam_c_w_txtAccountName") + getXPath_HasADescendantLabelContainsText("Account name");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlAddSource pnlAccNam txtAccountName']/input[contains(@wicketpath,'pnlAccNam_c_w_txtAccountName')][//label[contains(text(),'Account name')]]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnl-adv-search txtSearch") + getXPath_HasADescendantLabelEqualsText("SEARCH TEXT") + getXPath_ContainsWicketpath(input, "txtSearch");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnl-adv-search txtSearch'][//label[text()='SEARCH TEXT']]//input[contains(@wicketpath,'txtSearch')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("lnk-adv-options") + getXPath_DirectAButtonAndContainsWicketpath("lnk-adv-options_script") + getXPath_SpanEqualsText("Hide advanced options");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='lnk-adv-options']/a[contains(@wicketpath,'lnk-adv-options_script') and contains(@wicketpath,'lnk-adv-options_script')]//span[text()='Hide advanced options']";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("lnk-adv-options") + getXPath_DirectAButtonAndContainsWicketpath("lnk-adv-options_script") + getXPath_SpanEqualsText("Show advanced options");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='lnk-adv-options']/a[contains(@wicketpath,'lnk-adv-options_script') and contains(@wicketpath,'lnk-adv-options_script')]//span[text()='Show advanced options']";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlStage2") + getXPath(contains, class_att, "widget-expanded") + getXPath(notContains, class_att, "widget-collapsed");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlStage2'][contains(@class,'widget-expanded')][not(contains(@class,'widget-collapsed'))]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlStage2") + getXPath(contains, class_att, "widget-collapsed") + getXPath(notContains, class_att, "widget-expanded");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlStage2'][contains(@class,'widget-collapsed')][not(contains(@class,'widget-expanded'))]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath(ELEMENTS.DIV, ACTIONS.EQUALS, ATTRIBUTES.WICKETPATH, "multiFlow_panels_2") + getXPath_DivEqualsDataPath("pnlOfferValuesSysOffer pnlWarningScoreCardNotSetuped") + getXPath(ACTIONS.NOT_CONTAINS, ATTRIBUTES.CLASS, "invisible") + getXPath_ContainsWicketpath(ELEMENTS.DIV, "pnlWarningScoreCardNotSetuped_c_w_lblWarnScoreCardNotSetuped") + getXPath_HasADescendantSpanEqualsText("Score card was not fully set-up yet!");
        System.out.println(xpath);
        xpath2 = "//div[@wicketpath='multiFlow_panels_2']//div[@data-path='pnlOfferValuesSysOffer pnlWarningScoreCardNotSetuped'][not(contains(@class,'invisible'))]//div[contains(@wicketpath,'pnlWarningScoreCardNotSetuped_c_w_lblWarnScoreCardNotSetuped')][//span[text()='Score card was not fully set-up yet!']]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlBlack lnkClose") + getXPath_DirectAButtonContainsWicketpath("lnkClose_cancel") + getXPath(singleSlash, span, equals, class_att, "main") + getXPath(singleSlash, span, equals, class_att, "link");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlBlack lnkClose']/a[contains(@wicketpath,'lnkClose_cancel')]/span[@class='main']/span[@class='link']";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath= getXPath_DivEqualsDataPath("pnlBlack lnkClose") + getXPath_DirectAButtonContainsWicketpath("lnkClose_cancel") + getXPath_HasADescendant(span, equals, class_att, "main") + getXPath_HasADescendant(span, equals, class_att, "link");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlBlack lnkClose']/a[contains(@wicketpath,'lnkClose_cancel')][//span[@class='main']][//span[@class='link']]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlStageHeader") + getXPath_DirectAButtonAndContainsWicketpath("embeddedForm_3", "pnlStageHeader") + getXPath(equals, text, "Stage 3: Pre-Drawdown");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlStageHeader']/a[contains(@wicketpath,'embeddedForm_3') and contains(@wicketpath,'pnlStageHeader')][text()='Stage 3: Pre-Drawdown']";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlStageHeader") + getXPath_DirectAButtonAndContainsWicketpath("embeddedForm_3", "pnlStageHeader");
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlStageHeader']/a[contains(@wicketpath,'embeddedForm_3') and contains(@wicketpath,'pnlStageHeader')]";
        Assert.assertEquals("not equals", xpath, xpath2);

        xpath = getXPath_DivEqualsDataPath("pnlYouCanborrow3 lblYouCanborrow3") + getXPath_AndContainsWicketpath(singleSlash, div, "pnlYouCanborrow3", "lblYouCanborrow3") + getXPath(singleSlash, span, orContains, text, new XPathValues("Unfortunately, you have been approved only for £", "We are happy to inform you that you have been approved for this amount."));
        System.out.println(xpath);
        xpath2 = "//div[@data-path='pnlYouCanborrow3 lblYouCanborrow3']/div[contains(@wicketpath,'pnlYouCanborrow3') and contains(@wicketpath,'lblYouCanborrow3')]/span[contains(text(),'Unfortunately, you have been approved only for £') or contains(text(),'We are happy to inform you that you have been approved for this amount.')]";
        Assert.assertEquals("not equals", xpath, xpath2);
    }

    private boolean areStringsSame(String getXPath, String stringToCompare){
        System.out.println("areStringsSame ? ----> \n " + getXPath + " \n " + stringToCompare + "");
        return getXPath.equals(stringToCompare);
    }

    private void areStringsSame(String getXPath){
        System.out.println(getXPath);
    }

    @Test
    public void test6() {










        areStringsSame(getXPath(div, andContains, dataPath, new XPathValues("pnlYouCanborrow", "lblYouCanborrow")) + getXPath_AndContainsWicketpath(singleSlash, div, "pnlYouCanborrow", "lblYouCanborrow") + getXPath(singleSlash, span), "//div[contains(@data-path,'pnlYouCanborrow') and contains(@data-path,'lblYouCanborrow')]/div[contains(@wicketpath,'pnlYouCanborrow') and contains(@wicketpath,'lblYouCanborrow')]/span");

        areStringsSame(getXPath(div, andContains, dataPath, new XPathValues("pnlYouCanborrow1", "lblYouCanborrow1")) + getXPath_AndContainsWicketpath(singleSlash, div, "pnlYouCanborrow1", "lblYouCanborrow1") + getXPath(singleSlash, span), "//div[contains(@data-path,'pnlYouCanborrow1') and contains(@data-path,'lblYouCanborrow1')]/div[contains(@wicketpath,'pnlYouCanborrow1') and contains(@wicketpath,'lblYouCanborrow1')]/span");

        areStringsSame(getXPath(div, andContains, dataPath, new XPathValues("pnlYouCanborrow2", "lblYouCanborrow2")) + getXPath_AndContainsWicketpath(singleSlash, div, "pnlYouCanborrow2", "lblYouCanborrow2") + getXPath(singleSlash, span), "//div[contains(@data-path,'pnlYouCanborrow2') and contains(@data-path,'lblYouCanborrow2')]/div[contains(@wicketpath,'pnlYouCanborrow2') and contains(@wicketpath,'lblYouCanborrow2')]/span");

        areStringsSame(getXPath(div, andContains, dataPath, new XPathValues("pnlYouCanborrow3", "lblYouCanborrow3")) + getXPath_AndContainsWicketpath(singleSlash, div, "pnlYouCanborrow3", "lblYouCanborrow3") + getXPath(singleSlash, span), "//div[contains(@data-path,'pnlYouCanborrow3') and contains(@data-path,'lblYouCanborrow3')]/div[contains(@wicketpath,'pnlYouCanborrow3') and contains(@wicketpath,'lblYouCanborrow3')]/span");

        areStringsSame(getXPath(div, equals, dataType, "loancalc") + getXPath(div, equals, class_att, "sliders") + getXPath(singleSlash, div, equals, ariaDisabled, "true") + getXPath(contains, class_att, "loan"), "//div[@data-type='loancalc']//div[@class='sliders']/div[@aria-disabled='true'][contains(@class,'loan')]");

        areStringsSame(getXPath_InputEqualsName("userName"));

        areStringsSame(getXPath( PREFIX.SINGLE_SLASH, ELEMENTS.DIV, ACTIONS.CONTAINS, ATTRIBUTES.WICKETPATH, "multiFlow_panels") /** todo - is default xpath building method which expects two basic ways of */ + getXPath_HasADescendantSpanEqualsText("Form Tools") + getXPath(ELEMENTS.A, ACTIONS.CONTAINS, ATTRIBUTES.CLASS, "collapse"));

        areStringsSame(getXPath(ELEMENTS.DIV, ACTIONS.CONTAINS, ATTRIBUTES.WICKETPATH, "multiFlow_panels") + getXPath_HasADescendantSpanEqualsText("Form Tools") + getXPath(ELEMENTS.A, ACTIONS.CONTAINS, ATTRIBUTES.CLASS, "collapse") + getXPath(ACTIONS.CONTAINS, ATTRIBUTES.STYLE, "display: none"));

        areStringsSame(getXPath(ELEMENTS.DIV, ACTIONS.CONTAINS, ATTRIBUTES.WICKETPATH, "multiFlow_panels") + getXPath_HasADescendantSpanEqualsText("Form Tools") + getXPath(ELEMENTS.A, ACTIONS.CONTAINS, ATTRIBUTES.CLASS, "collapse") + getXPath(ACTIONS.NOT_CONTAINS, ATTRIBUTES.STYLE, "display: none"));


        String a = "//div[contains(@wicketpath,'multiFlow_panels')][//span[text()='Form Tools']]//a[contains(@class,'collapse')]";
        String b = "//div[contains(@wicketpath,'multiFlow_panels')][//span[text()='Form Tools']]//a[contains(@class,'collapse')][contains(@style,'display: none')]";
        String c = "//div[contains(@wicketpath,'multiFlow_panels')][//span[text()='Form Tools']]//a[contains(@class,'collapse')][not(contains(@style,'display: none'))]";

//        areStringsSame()


        //getXPath(); /** todo - is default xpath building method which expects two basic ways of calling */

        /** "1st way" */
            /** getXPath(optional - PREFIX, mandatory - ELEMENTS, mandatory ACTIONS, mandatory ATTRIBUTES, mandatory String value or a XPathValues() - that will be described later ) */
            getXPath(ELEMENTS.DIV, ACTIONS.CONTAINS, ATTRIBUTES.WICKETPATH, "multiFlow_panels");   /** that will produce           "//div[contains(@wicketpath,'multiFlow_panels')]"   */

        /** "2nd way" */
            /** getXPath(mandatory - ACTIONS, mandatory ATTRIBUTES, mandatory String value or a XPathValues())  */
            getXPath(ACTIONS.CONTAINS, ATTRIBUTES.TEXT, "Text to Validate");                       /** this one will create this   "[contains(text(),'Text to Validate')]"             */
//        escape.

        getXPath_DivEqualsDataPath("");                                                 /** is equivalent to */ getXPath(PREFIX.DOUBLE_SLASH, ELEMENTS.DIV, ACTIONS.EQUALS, ATTRIBUTES.DATA_PATH, "");
        getXPath_DivAndContainsDataPath("");                                            /** */ getXPath(PREFIX.DOUBLE_SLASH, ELEMENTS.DIV, ACTIONS.AND_CONTAINS, ATTRIBUTES.DATA_PATH, "");
        getXPath_InputEqualsName("");                                                   /** */ getXPath(PREFIX.DOUBLE_SLASH, ELEMENTS.INPUT, ACTIONS.EQUALS, ATTRIBUTES.NAME, "");
        getXPath_AndContainsWicketpath(PREFIX.DOUBLE_SLASH, ELEMENTS.DIV, "", "", "");  /** */ getXPath(PREFIX.DOUBLE_SLASH, ELEMENTS.DIV, ACTIONS.AND_CONTAINS, ATTRIBUTES.WICKETPATH, new XPathValues("", "", ""));
        getXPath_DivEqualsId("");                                                       /** */ getXPath(PREFIX.DOUBLE_SLASH, ELEMENTS.DIV, ACTIONS.EQUALS, ATTRIBUTES.ID, "");
        getXPath_ContainsWicketpath(PREFIX.DOUBLE_SLASH, ELEMENTS.DIV, "");             /** */ getXPath(PREFIX.DOUBLE_SLASH, ELEMENTS.DIV, ACTIONS.CONTAINS, ATTRIBUTES.WICKETPATH, "");
        getXPath_DirectSpanEqualsText("");                                              /** */ getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.SPAN, ACTIONS.EQUALS, ATTRIBUTES.TEXT, "");
        getXPath_DirectAButtonContainsWicketpath("");                                   /** */ getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.A, ACTIONS.CONTAINS, ATTRIBUTES.WICKETPATH, "");
        getXPath_DirectAButtonContainsOrContainsWicketpath("", "");                     /** */ getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.A, ACTIONS.OR_CONTAINS, ATTRIBUTES.WICKETPATH, new XPathValues("", ""));
        getXPath_DirectAButtonAndContainsWicketpath("");                                /** */ getXPath(PREFIX.SINGLE_SLASH, ELEMENTS.A, ACTIONS.AND_CONTAINS, ATTRIBUTES.WICKETPATH, new XPathValues("", ""));
        getXPath_HasADescendant("stringText");                                          /** This one is only adding brackets around the variable - "[" + "stringText" + "]" */
        getXPath_HasADescendantSpanText(ACTIONS.CONTAINS, "");                          /** is equivalent to */ getXPath_HasADescendant(getXPath(PREFIX.DOUBLE_SLASH, ELEMENTS.SPAN, ACTIONS.CONTAINS, ATTRIBUTES.TEXT, ""));
        getXPath_HasADescendantSpanEqualsText("");                                        /** */ getXPath_HasADescendant(getXPath(PREFIX.DOUBLE_SLASH, ELEMENTS.SPAN, ACTIONS.EQUALS, ATTRIBUTES.TEXT, ""));
        getXPath_HasADescendantSpanContainsText("");                                      /** */ getXPath_HasADescendant(getXPath(PREFIX.DOUBLE_SLASH, ELEMENTS.SPAN, ACTIONS.CONTAINS, ATTRIBUTES.TEXT, ""));
        getXPath_HasADescendantLabelEqualsText("");                                       /** */ getXPath_HasADescendant(getXPath(PREFIX.DOUBLE_SLASH, ELEMENTS.LABEL, ACTIONS.EQUALS, ATTRIBUTES.TEXT, ""));
        getXPath_HasADescendantLabelContainsText("");                                     /** */ getXPath_HasADescendant(getXPath(PREFIX.DOUBLE_SLASH, ELEMENTS.LABEL, ACTIONS.CONTAINS, ATTRIBUTES.TEXT, ""));



















    }

    @Test
    public void test7() {


        areStringsSame(getXPath(div, equals, wicketpath, "multiFlow_panels_0") + getXPath_DivEqualsDataPath("pnlStage2") + getXPath_DirectAButtonContainsWicketpath("pnlStage2_label") + getXPath(equals, text, "Stage 2: Credit Review"));
    // When something is reapeating so often so you want to reduce code redundancy easily you can create simplistic method getXPath_WhatEverYouAreMissingThatItProvides("justOneStringParameter")
      String xpath = getXPath(div, equals, wicketpath, "multiFlow_panels_0") + getXPath_DivEqualsDataPath("pnlStage2") + getXPath_DirectAButtonContainsWicketpath("pnlStage2_label") + getXPath(equals, text, "Stage 2: Credit Review");


    }
}