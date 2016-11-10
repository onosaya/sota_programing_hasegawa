//このソースは、VstoneMagicによって自動生成されました。
//ソースの内容を書き換えた場合、VstoneMagicで開けなくなる場合があります。
package	jp.co.mysota;
import	main.main.GlobalVariable;
import	jp.vstone.RobotLib.*;
import	jp.vstone.sotatalk.*;
import	jp.vstone.sotatalk.SpeechRecog.*;
import	jp.vstone.camera.*;

public class roudoku
{

	public String speechRecogResult;
	public RecogResult recogresult;
	public jp.co.mysota.mgirl mgirl;
	public jp.co.mysota.kumonoito kumonoito;
	public jp.co.mysota.rabit rabit;
	public roudoku()																									//@<BlockInfo>jp.vstone.block.func.constructor,16,16,400,16,False,6,@</BlockInfo>
	{
																														//@<OutputChild>
		/*String speechRecogResult*/;																					//@<BlockInfo>jp.vstone.block.variable,80,16,80,16,False,5,break@</BlockInfo>
																														//@<EndOfBlock/>
		/*RecogResult recogresult*/;																					//@<BlockInfo>jp.vstone.block.variable,144,16,144,16,False,4,break@</BlockInfo>
																														//@<EndOfBlock/>
		mgirl=new jp.co.mysota.mgirl();																					//@<BlockInfo>jp.vstone.block.variable,208,16,208,16,False,3,break@</BlockInfo>
																														//@<EndOfBlock/>
		kumonoito=new jp.co.mysota.kumonoito();																			//@<BlockInfo>jp.vstone.block.variable,272,16,272,16,False,2,break@</BlockInfo>
																														//@<EndOfBlock/>
		rabit=new jp.co.mysota.rabit();																					//@<BlockInfo>jp.vstone.block.variable,336,16,336,16,False,1,break@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>
	}																													//@<EndOfBlock/>

	//@<Separate/>
	public void yomu()																									//@<BlockInfo>jp.vstone.block.func,64,176,816,176,False,23,@</BlockInfo>
	throws SpeechRecogAbortException {
		if(!GlobalVariable.TRUE) throw new SpeechRecogAbortException("default");

																														//@<OutputChild>
		GlobalVariable.sotawish.Say((String)"はじめるよ．",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);		//@<BlockInfo>jp.vstone.block.talk.say,128,176,128,176,False,22,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"何を読もうか．マッチ売りの少女，あなうさピーターのはなし，蜘蛛の糸があります．または，終わりと言ってください．",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,192,176,192,176,False,21,@</BlockInfo>
																														//@<EndOfBlock/>
		while(GlobalVariable.TRUE)																						//@<BlockInfo>jp.vstone.block.while.endless,480,176,688,176,False,20,Endless@</BlockInfo>
		{

																														//@<OutputChild>
			recogresult = GlobalVariable.recog.getRecognitionwithAbort((int)60000);										//@<BlockInfo>jp.vstone.block.talk.speechrecog.regex2,160,272,592,272,False,19,音声認識を行い、結果を条件に正規表現文字列で比較する。認識スコアが一番高い結果に分岐する。実際に認識された文字列はspeechRecogResultに代入される@</BlockInfo>
			speechRecogResult = recogresult.CheckBest(new String[]{
			 ".*くも.*" ,  ".*マッチ.*" ,  ".*うさぎ.*" ,  ".*おわり.*" ,  "" , 
			},true);
			if(speechRecogResult == null) speechRecogResult = "";

			if(speechRecogResult.contains((String)".*くも.*"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					kumonoito.talk();																						//@<BlockInfo>jp.vstone.block.callfunc.base,224,272,224,272,False,9,@</BlockInfo>	@<EndOfBlock/>
					GlobalVariable.sotawish.Say((String)"おわります．",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,352,272,352,272,False,8,@</BlockInfo>
																															//@<EndOfBlock/>
					break;																									//@<BlockInfo>jp.vstone.block.break,416,272,416,272,False,7,break@</BlockInfo>	@<EndOfBlock/>
																																//@</OutputChild>

			}
			else if(speechRecogResult.contains((String)".*マッチ.*"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					mgirl.talk();																							//@<BlockInfo>jp.vstone.block.callfunc.base,224,368,224,368,False,12,@</BlockInfo>	@<EndOfBlock/>
					GlobalVariable.sotawish.Say((String)"おわります．",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,352,368,352,368,False,11,@</BlockInfo>
																															//@<EndOfBlock/>
					break;																									//@<BlockInfo>jp.vstone.block.break,416,368,416,368,False,10,break@</BlockInfo>	@<EndOfBlock/>
																																//@</OutputChild>

			}
			else if(speechRecogResult.contains((String)".*うさぎ.*"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					rabit.talk();																							//@<BlockInfo>jp.vstone.block.callfunc.base,224,464,224,464,False,15,@</BlockInfo>	@<EndOfBlock/>
					GlobalVariable.sotawish.Say((String)"おわります．",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,352,464,352,464,False,14,@</BlockInfo>
																															//@<EndOfBlock/>
					break;																									//@<BlockInfo>jp.vstone.block.break,416,464,416,464,False,13,break@</BlockInfo>	@<EndOfBlock/>
																																//@</OutputChild>

			}
			else if(speechRecogResult.contains((String)".*おわり.*"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"おわります．",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,224,560,224,560,False,17,@</BlockInfo>
																															//@<EndOfBlock/>
					break;																									//@<BlockInfo>jp.vstone.block.break,352,560,352,560,False,16,break@</BlockInfo>	@<EndOfBlock/>
																																//@</OutputChild>

			}
			else
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"何を読もうか．マッチ売りの少女，あなうさピーターのはなし，蜘蛛の糸があります．または，終わりと言ってください．",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,224,656,224,656,False,18,@</BlockInfo>
																															//@<EndOfBlock/>
																																//@</OutputChild>

			}
																														//@<EndOfBlock/>
																														//@</OutputChild>
		}
																														//@<EndOfBlock/>
																														//@</OutputChild>

	}																													//@<EndOfBlock/>

}
