package com.incobeta.myapplication.phone;

import android.content.Context;
import android.util.Log;

import java.util.Date;

/**
 * Created by witwicky on 15/08/18.
 */

public class CallReceiver extends PhonecallReceiver {
    @Override
    protected void onIncomingCallReceived(Context ctx, String number, Date start)
    {
        //
        Log.i("CALL_RECEIVED", "This person is trying to call:- " + number);
    }

    @Override
    protected void onIncomingCallAnswered(Context ctx, String number, Date start)
    {
        //
        Log.i("CALL_ANSWERED", "This person has been answered:- " + number);
    }

    @Override
    protected void onIncomingCallEnded(Context ctx, String number, Date start, Date end)
    {
        //
        Log.i("CALL_ENDED", "This person has finished talking:- " + number);
    }

    @Override
    protected void onOutgoingCallStarted(Context ctx, String number, Date start)
    {
        //
        Log.i("CALL_STARTED", "This person is being called:- " + number);
    }

    @Override
    protected void onOutgoingCallEnded(Context ctx, String number, Date start, Date end)
    {
        //
        Log.i("OUTGOING_CALL_ENDED", "This person has finished being called:- " + number);
    }

    @Override
    protected void onMissedCall(Context ctx, String number, Date start)
    {
        //
        Log.i("CALL_MISSED", "This person tried to call you:- " + number);
    }
}
