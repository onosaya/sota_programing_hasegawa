//このソースは、VstoneMagicによって自動生成されました。
//ソースの内容を書き換えた場合、VstoneMagicで開けなくなる場合があります。
package	jp.co.mysota;
import	main.main.GlobalVariable;
import	jp.vstone.RobotLib.*;
import	jp.vstone.sotatalk.*;
import	jp.vstone.sotatalk.SpeechRecog.*;

public class mymain
{

	public String speechRecogResult;
	public RecogResult recogresult;
	public jp.co.mysota.rabit rabit;
	public jp.co.mysota.kumonoito kumonoito;
	public jp.co.mysota.mgirl mgirl;
	public void main()																									//@<BlockInfo>jp.vstone.block.func,32,192,752,192,False,16,コメント@</BlockInfo>
	throws SpeechRecogAbortException {
		if(!GlobalVariable.TRUE) throw new SpeechRecogAbortException("default");

																														//@<OutputChild>
		GlobalVariable.sotawish.Say((String)"はじめるよ．",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);		//@<BlockInfo>jp.vstone.block.talk.say,288,192,288,192,False,15,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"何を読もうか．マッチ売りの少女，あなうさピーターのはなし，蜘蛛の糸があります．マッチ，うさぎ，蜘蛛と答えてください．または，終わりと言ってください．",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,352,192,352,192,False,14,@</BlockInfo>
																														//@<EndOfBlock/>
		while(GlobalVariable.TRUE)																						//@<BlockInfo>jp.vstone.block.while.endless,416,192,624,192,False,13,Endless@</BlockInfo>
		{

																														//@<OutputChild>
			recogresult = GlobalVariable.recog.getRecognitionwithAbort((int)60000);										//@<BlockInfo>jp.vstone.block.talk.speechrecog.score2,144,336,512,336,False,12,音声認識を行い、認識候補との完全一致で比較する。認識スコアが一番高い結果に分岐する。実際に認識された文字列はspeechRecogResultに代入される@</BlockInfo>
			speechRecogResult = recogresult.CheckBest(new String[]{
			 "蜘蛛" ,  "マッチ" ,  "うさぎ" ,  "おわり" ,  "" , 
			},false);
			if(speechRecogResult == null) speechRecogResult = "";

			if(speechRecogResult.contains((String)"蜘蛛"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					kumonoito.talk();																						//@<BlockInfo>jp.vstone.block.callfunc.base,208,336,208,336,False,3,@</BlockInfo>	@<EndOfBlock/>
					GlobalVariable.sotawish.Say((String)"おわります．",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,336,336,336,336,False,2,@</BlockInfo>
																															//@<EndOfBlock/>
					break;																									//@<BlockInfo>jp.vstone.block.break,400,336,400,336,False,1,break@</BlockInfo>	@<EndOfBlock/>
																																//@</OutputChild>

			}
			else if(speechRecogResult.contains((String)"マッチ"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					mgirl.talk();																							//@<BlockInfo>jp.vstone.block.callfunc.base,208,432,208,432,False,6,@</BlockInfo>	@<EndOfBlock/>
					GlobalVariable.sotawish.Say((String)"おわります．",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,336,432,336,432,False,5,@</BlockInfo>
																															//@<EndOfBlock/>
					break;																									//@<BlockInfo>jp.vstone.block.break,400,432,400,432,False,4,break@</BlockInfo>	@<EndOfBlock/>
																																//@</OutputChild>

			}
			else if(speechRecogResult.contains((String)"うさぎ"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					rabit.talk();																							//@<BlockInfo>jp.vstone.block.callfunc.base,208,528,208,528,False,9,@</BlockInfo>	@<EndOfBlock/>
					GlobalVariable.sotawish.Say((String)"おわります．",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,336,528,336,528,False,8,@</BlockInfo>
																															//@<EndOfBlock/>
					break;																									//@<BlockInfo>jp.vstone.block.break,400,528,400,528,False,7,break@</BlockInfo>	@<EndOfBlock/>
																																//@</OutputChild>

			}
			else if(speechRecogResult.contains((String)"おわり"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"おわります．",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,208,624,208,624,False,11,@</BlockInfo>
																															//@<EndOfBlock/>
					break;																									//@<BlockInfo>jp.vstone.block.break,336,624,336,624,False,10,break@</BlockInfo>	@<EndOfBlock/>
																																//@</OutputChild>

			}
			else
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"何を読もうか．マッチ売りの少女，あなうさピーターのはなし，蜘蛛の糸があります．マッチ，うさぎ，蜘蛛と答えてください．または，終わりと言ってください．",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,208,720,208,720,False,23,@</BlockInfo>
																															//@<EndOfBlock/>
																																//@</OutputChild>

			}
																														//@<EndOfBlock/>
																														//@</OutputChild>
		}
																														//@<EndOfBlock/>
																														//@</OutputChild>

	}																													//@<EndOfBlock/>

	//@<Separate/>
	public mymain()																										//@<BlockInfo>jp.vstone.block.func.constructor,32,32,416,32,False,22,@</BlockInfo>
	{
																														//@<OutputChild>
		/*String speechRecogResult*/;																					//@<BlockInfo>jp.vstone.block.variable,96,32,96,32,False,21,break@</BlockInfo>
																														//@<EndOfBlock/>
		/*RecogResult recogresult*/;																					//@<BlockInfo>jp.vstone.block.variable,160,32,160,32,False,20,break@</BlockInfo>
																														//@<EndOfBlock/>
		rabit=new jp.co.mysota.rabit();																					//@<BlockInfo>jp.vstone.block.variable,224,32,224,32,False,19,break@</BlockInfo>
																														//@<EndOfBlock/>
		kumonoito=new jp.co.mysota.kumonoito();																			//@<BlockInfo>jp.vstone.block.variable,288,32,288,32,False,18,break@</BlockInfo>
																														//@<EndOfBlock/>
		mgirl=new jp.co.mysota.mgirl();																					//@<BlockInfo>jp.vstone.block.variable,352,32,352,32,False,17,break@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>
	}																													//@<EndOfBlock/>

}
