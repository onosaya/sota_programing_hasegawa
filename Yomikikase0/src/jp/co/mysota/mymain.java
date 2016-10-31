//このソースは、VstoneMagicによって自動生成されました。
//ソースの内容を書き換えた場合、VstoneMagicで開けなくなる場合があります。
package	jp.co.mysota;
import	main.main.GlobalVariable;
import	jp.vstone.RobotLib.*;
import	jp.vstone.sotatalk.*;
import	jp.vstone.sotatalk.SpeechRecog.*;
import	java.awt.Color;

public class mymain
{

	public CRobotPose pose;
	public jp.co.mysota.kumonoito kumonoito;
	public String speechRecogResult;
	public RecogResult recogresult;
	public jp.co.mysota.mgirl mgirl;
	public jp.co.mysota.rabit rabit;
	public mymain()																										//@<BlockInfo>jp.vstone.block.func.constructor,32,32,480,32,False,7,@</BlockInfo>
	{
																														//@<OutputChild>
		/*CRobotPose pose*/;																							//@<BlockInfo>jp.vstone.block.variable,96,32,96,32,False,6,break@</BlockInfo>
																														//@<EndOfBlock/>
		kumonoito=new jp.co.mysota.kumonoito();																			//@<BlockInfo>jp.vstone.block.variable,160,32,160,32,False,5,break@</BlockInfo>
																														//@<EndOfBlock/>
		/*String speechRecogResult*/;																					//@<BlockInfo>jp.vstone.block.variable,224,32,224,32,False,4,break@</BlockInfo>
																														//@<EndOfBlock/>
		/*RecogResult recogresult*/;																					//@<BlockInfo>jp.vstone.block.variable,288,32,288,32,False,3,break@</BlockInfo>
																														//@<EndOfBlock/>
		mgirl=new jp.co.mysota.mgirl();																					//@<BlockInfo>jp.vstone.block.variable,352,32,352,32,False,2,break@</BlockInfo>
																														//@<EndOfBlock/>
		rabit=new jp.co.mysota.rabit();																					//@<BlockInfo>jp.vstone.block.variable,416,32,416,32,False,1,break@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>
	}																													//@<EndOfBlock/>

	//@<Separate/>
	public void main()																									//@<BlockInfo>jp.vstone.block.func,96,160,656,160,False,24,コメント@</BlockInfo>
	throws SpeechRecogAbortException {
		if(!GlobalVariable.TRUE) throw new SpeechRecogAbortException("default");

																														//@<OutputChild>
		rabit.talk();																									//@<BlockInfo>jp.vstone.block.callfunc.base,160,160,160,160,False,25,@</BlockInfo>	@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"はじめるよ．",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);		//@<BlockInfo>jp.vstone.block.talk.say,256,160,256,160,False,23,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"何を読もうか．マッチ売りの少女，あなうさピーターのはなし，蜘蛛の糸があります．または，終わりと言ってください．",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,320,160,320,160,False,22,@</BlockInfo>
																														//@<EndOfBlock/>
		while(GlobalVariable.TRUE)																						//@<BlockInfo>jp.vstone.block.while.endless,384,160,592,160,False,21,Endless@</BlockInfo>
		{

																														//@<OutputChild>
			recogresult = GlobalVariable.recog.getRecognitionwithAbort((int)60000);										//@<BlockInfo>jp.vstone.block.talk.speechrecog.score2,112,304,480,304,False,20,音声認識を行い、認識候補との完全一致で比較する。認識スコアが一番高い結果に分岐する。実際に認識された文字列はspeechRecogResultに代入される@</BlockInfo>
			speechRecogResult = recogresult.CheckBest(new String[]{
			 "蜘蛛の糸" ,  "マッチ売りの少女" ,  "あなうさピーターのはなし " ,  "おわり" ,  "" , 
			},false);
			if(speechRecogResult == null) speechRecogResult = "";

			if(speechRecogResult.contains((String)"蜘蛛の糸"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					kumonoito.talk();																						//@<BlockInfo>jp.vstone.block.callfunc.base,176,304,176,304,False,10,@</BlockInfo>	@<EndOfBlock/>
					GlobalVariable.sotawish.Say((String)"おわります．",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,304,304,304,304,False,9,@</BlockInfo>
																															//@<EndOfBlock/>
					break;																									//@<BlockInfo>jp.vstone.block.break,368,304,368,304,False,8,break@</BlockInfo>	@<EndOfBlock/>
																																//@</OutputChild>

			}
			else if(speechRecogResult.contains((String)"マッチ売りの少女"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					mgirl.talk();																							//@<BlockInfo>jp.vstone.block.callfunc.base,176,400,176,400,False,13,@</BlockInfo>	@<EndOfBlock/>
					GlobalVariable.sotawish.Say((String)"おわります．",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,304,400,304,400,False,12,@</BlockInfo>
																															//@<EndOfBlock/>
					break;																									//@<BlockInfo>jp.vstone.block.break,368,400,368,400,False,11,break@</BlockInfo>	@<EndOfBlock/>
																																//@</OutputChild>

			}
			else if(speechRecogResult.contains((String)"あなうさピーターのはなし "))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					rabit.talk();																							//@<BlockInfo>jp.vstone.block.callfunc.base,176,496,176,496,False,16,@</BlockInfo>	@<EndOfBlock/>
					GlobalVariable.sotawish.Say((String)"おわります．",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,304,496,304,496,False,15,@</BlockInfo>
																															//@<EndOfBlock/>
					break;																									//@<BlockInfo>jp.vstone.block.break,368,496,368,496,False,14,break@</BlockInfo>	@<EndOfBlock/>
																																//@</OutputChild>

			}
			else if(speechRecogResult.contains((String)"おわり"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"おわります．",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,176,592,176,592,False,18,@</BlockInfo>
																															//@<EndOfBlock/>
					break;																									//@<BlockInfo>jp.vstone.block.break,304,592,304,592,False,17,break@</BlockInfo>	@<EndOfBlock/>
																																//@</OutputChild>

			}
			else
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"何を読もうか．マッチ売りの少女，あなうさピーターのはなし，蜘蛛の糸があります．または，終わりと言ってください．",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,176,688,176,688,False,19,@</BlockInfo>
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
