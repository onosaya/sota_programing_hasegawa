//このソースは、VstoneMagicによって自動生成されました。
//ソースの内容を書き換えた場合、VstoneMagicで開けなくなる場合があります。
package	jp.co.mysota;
import	main.main.GlobalVariable;
import	jp.vstone.RobotLib.*;
import	jp.vstone.sotatalk.*;
import	java.awt.Color;
import	jp.vstone.sotatalk.SpeechRecog.*;

public class rabit
{

	public CRobotPose pose;
	public rabit()																										//@<BlockInfo>jp.vstone.block.func.constructor,16,16,144,16,False,2,@</BlockInfo>
	{
																														//@<OutputChild>
		/*CRobotPose pose*/;																							//@<BlockInfo>jp.vstone.block.variable,80,16,80,16,False,1,break@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>
	}																													//@<EndOfBlock/>

	//@<Separate/>
	public void talk()																									//@<BlockInfo>jp.vstone.block.func,32,144,784,144,False,54,@</BlockInfo>
	throws SpeechRecogAbortException {
		if(!GlobalVariable.TRUE) throw new SpeechRecogAbortException("default");

																														//@<OutputChild>
		GlobalVariable.sotawish.Say((String)"青空文庫　あなうさピーターのはなし　を読みます．",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,96,144,96,144,False,53,@</BlockInfo>
																														//@<EndOfBlock/>
		pose = new CRobotPose();																						//@<BlockInfo>jp.vstone.block.pose,160,144,160,144,False,52,コメント@</BlockInfo>
		pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
						new Short[]{0,-900,0,900,0,0,0,0}
						);
		pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
						new Short[]{100,100,100,100,100,100,100,100}
						);
		pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
						new Short[]{0,-255,0,180,80,0,180,80,0}
						);
		GlobalVariable.motion.play(pose,1600);
		CRobotUtil.wait(1600);																							//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"むかしむかし　あるところに　よんひき の　子兎が　おりました。　なまえは　それぞれ　フロプシー、モプシー、カトンテル、ピーターです。よんひき は　おかあさんと　いっしょに　とってもおおきな　モミのきの　したにある　あなのなかに　すんでいました。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,224,144,224,144,False,51,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"あるひの朝、　「あなうさママ」が　いいました。「さあ　おまえたち、　のはら の なか や　小道のさきで　あそんでらっしゃい。　でも、　マグレガーおじさんの　お庭には　いっちゃダメよ。　むかし　おとうさんが　そこで　ひょんなことから　マグレガーおばさんに　つかまって　パイに　されたんだから。」",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,288,144,288,144,False,50,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"ぺーじ　を　めくって",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,352,144,352,144,False,49,@</BlockInfo>
																														//@<EndOfBlock/>
		CRobotUtil.wait((int)2000);																						//@<BlockInfo>jp.vstone.block.wait,416,144,416,144,False,48,コメント@</BlockInfo>	@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"「いってらっしゃい、気をつけるのよ。　おかあさん、　るすに　してるから。」",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,480,144,480,144,False,47,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"それから　「あなうさママ」は　かごと　かさを　てにもって、　もりの　むこうの　パンやさんへ　むかいました。　買ったのは　いっきんの　くろパンと　ぶどうパンを　５つです。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,544,144,544,144,False,46,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"ぺーじ　を　めくって",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,608,144,608,144,False,45,@</BlockInfo>
																														//@<EndOfBlock/>
		CRobotUtil.wait((int)2000);																						//@<BlockInfo>jp.vstone.block.wait,672,144,672,144,False,44,コメント@</BlockInfo>	@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"フロプシーと　モプシーと　カトンテルは　とっても　良い子でしたので、　小道をくだって　クロイチゴ摘みに出かけました。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,224,224,224,224,False,43,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"けれども　ピーターは　ひどく　やんちゃでしたので、　そのまま　マグレガーおじさんのお庭に一目散、　入り口の柵の下を　むりくり　くぐり抜けたのです！",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,288,224,288,224,False,42,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"ぺーじ　を　めくって",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,352,224,352,224,False,41,@</BlockInfo>
																														//@<EndOfBlock/>
		CRobotUtil.wait((int)2000);																						//@<BlockInfo>jp.vstone.block.wait,416,224,416,224,False,40,コメント@</BlockInfo>	@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"すぐさま レタスと インゲンを かじって おまけに ハツカダイコンまで。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,480,224,480,224,False,39,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"すると どうも きぶんが わるくなったので おくすりの パセリを さがすことに しました。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,544,224,544,224,False,38,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"ぺーじ　を　めくって",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,608,224,608,224,False,37,@</BlockInfo>
																														//@<EndOfBlock/>
		CRobotUtil.wait((int)2000);																						//@<BlockInfo>jp.vstone.block.wait,672,224,672,224,False,36,コメント@</BlockInfo>	@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"ところが　キュウリの苗箱を回った所で出くわしたのが、　なんと　マグレガーおじさん！",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,224,304,224,304,False,35,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"マグレガーおじさんは四つん這いで　キャベツの苗を植えていたのですが、　跳びあがって　ピーターを追いかけます。　鍬を振り振り叫ぶのです。　「まてえ、　ぬすっと！」",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,288,304,288,304,False,34,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"ぺーじ　を　めくって",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,352,304,352,304,False,33,@</BlockInfo>
																														//@<EndOfBlock/>
		CRobotUtil.wait((int)2000);																						//@<BlockInfo>jp.vstone.block.wait,416,304,416,304,False,32,コメント@</BlockInfo>	@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"ピーターは　もう　びっくりして　震えあがって庭中を駆け回りました。　それというのも入り口が　どこにあったのか　分からなくなったのです。しかも　キャベツ畑で靴を片っぽ、　ジャガイモ畑で　もう片っぽ　無くしてしまいました。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,480,304,480,304,False,31,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"靴も無いので　よつ足で走ると　ぐんぐん　速くなって、　うまく行けば逃げられたと思うのですが、　運悪く　スグリの網に　つっこんでしまい、　上着の大きなボタンが引っかかってしまったのです。　ちなみに　青の上着で真鍮のボタンつき　おろしたての物でした。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,544,304,544,304,False,30,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"ぺーじ　を　めくって",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,608,304,608,304,False,29,@</BlockInfo>
																														//@<EndOfBlock/>
		CRobotUtil.wait((int)2000);																						//@<BlockInfo>jp.vstone.block.wait,672,304,672,304,False,28,コメント@</BlockInfo>	@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"僕は　もう　死ぬんだな、　ピーターは　大粒の涙を流しました。　でも　その鳴き声が　たまたま　優しい雀達にも聞こえて、　そして　慌てて　そばに　飛んで来て　諦めないでと言うのです。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,224,384,224,384,False,27,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"マグレガーおじさんが　やってきて　持ってきた　ふるいを　ピーターの上から　ぱっと　かぶせようと　しましたが、　ピーターは　寸でのところで　上着を　ぬぎぬぎ　後に残して逃げ出しました。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,288,384,288,384,False,26,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"ぺーじ　を　めくって",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,352,384,352,384,False,25,@</BlockInfo>
																														//@<EndOfBlock/>
		CRobotUtil.wait((int)2000);																						//@<BlockInfo>jp.vstone.block.wait,416,384,416,384,False,24,コメント@</BlockInfo>	@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"そして　物置小屋に　駆け込んで　じょうろ　の中に　飛び込みました。　とってもいい　隠れ場だと思ったのに 水 が沢山入っているなんて。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,480,384,480,384,False,23,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"マグレガーおじさんには　まる分かりでした。　ピーターは　絶対　物置小屋の　どこかに　いる。もしかすると　植木鉢の中かもしれない。　やがて　そろりと持ち上げて　ひとつずつ中を見るのです。まさに　その時，ピーターが　くしゃみを　――「はっくしゅん！」　マグレガーおじさんが　たちまち近づきます。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,544,384,544,384,False,22,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"ぺーじ　を　めくって",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,608,384,608,384,False,21,@</BlockInfo>
																														//@<EndOfBlock/>
		CRobotUtil.wait((int)2000);																						//@<BlockInfo>jp.vstone.block.wait,672,384,672,384,False,20,コメント@</BlockInfo>	@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"足で　踏みつけられそうになりましたが、　ピーターは窓の外へと飛び出して，ついでに植木をみっつ倒しました。窓が小さすぎたので、　マグレガーおじさんも　ピーターを追いかけるのを諦めて　のら仕事へ戻ることに　しました。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,224,464,224,464,False,19,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"ピーターは　ほっとして　腰を落ち着けます。　息も　きれぎれ、　心も　ぶるぶる、　どっちへいったら　いいのか　ちっとも　分かりません。　しかも　じょうろの中に　いたので　もう　ずぶ濡れです。　しばらくして　うろちょろ　しはじめましたが、　とぼとぼ　――　とぼとぼ　――　ゆっくりと　歩いて　きょろきょろ。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,288,464,288,464,False,18,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"ぺーじ　を　めくって",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,352,464,352,464,False,17,@</BlockInfo>
																														//@<EndOfBlock/>
		CRobotUtil.wait((int)2000);																						//@<BlockInfo>jp.vstone.block.wait,416,464,416,464,False,16,コメント@</BlockInfo>	@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"壁に　ドアを　見つけましたが、　鍵が　閉まっていて　下を　くぐりぬけようにも　ぷっくりした　子兎の通る隙間は　ありません。　お母さんネズミが　石の戸口を入ったり出たりして　木の中で待っている家族に　お豆を　運んでいます。　ピーターは　そのねずみに　入り口への　行き方を　聞きましたが、　口に大きな　お豆を　くわえていましたので　ねずみは　何も返事ができません。　ただ　首を振るだけなので、　ピーターは　涙が出てきました。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,480,464,480,464,False,15,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"それから　お庭を　つっきって　帰り道を　探そうと　しましたが、　余計に　迷ってしまいました。　やがて　マグレガーおじさんが　水汲みをする溜池のところへ　たどりつきます。　白い猫が金魚を　じっと　にらんでいて　ぴくりとも　動きませんが　時たま　しっぽの先が　生き物みたいに　くねくねと　していました。　ピーターは　そっとしておくのが　一番と　思いました。　いとこの　ばにばに　ベンジャミンくん　から　猫の事は　それなりに聞いていたのです。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,544,464,544,464,False,14,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"ぺーじ　を　めくって",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,608,464,608,464,False,13,@</BlockInfo>
																														//@<EndOfBlock/>
		CRobotUtil.wait((int)2000);																						//@<BlockInfo>jp.vstone.block.wait,672,464,672,464,False,12,コメント@</BlockInfo>	@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"物置小屋に戻ろうとすると　いきなり　すぐそばから　鍬の音が聞こえてきました。　さっくり、　さくさく、　さっくり。　ピーターは　茂みの下を　あたふたと　走り回ります。　けれども　なんということも　ないので　すぐに出て行って手押し車の上へ登り　様子を　うかがってみました。　まず　見えたのが　タマネギ畑を耕す　マグレガーおじさん、　ピーターには背中を向けていて　なんと　その向うに入り口が　あるのです！",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,224,544,224,544,False,11,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"ピーターは　音も立てずに　手押し車を降りて全速力で走り出しました。　クロスグリの茂みの裏　まっすぐ　道を進みます。　角の所で　マグレガーおじさんに　見つかりましたが　ピーターは　構いません。　入り口に下に滑り込んで　とうとう　庭の外、　森に入れば安全です。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,288,544,288,544,False,10,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"ぺーじ　を　めくって",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,352,544,352,544,False,9,@</BlockInfo>
																														//@<EndOfBlock/>
		CRobotUtil.wait((int)2000);																						//@<BlockInfo>jp.vstone.block.wait,416,544,416,544,False,8,コメント@</BlockInfo>	@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"マグレガーおじさんは　小さな上着と靴を棒に引っ掛け　烏除けの案山子にしました。　ピーターは　そのままずっと　走りっぱなしで　振り返ることもなく　大きなモミの木の　お家まで　帰りました。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,480,544,480,544,False,7,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"もう　くたくたなので　兎穴の　ふかふかした　柔らかい土の地面に寝っ転がると，瞼が直ぐに落ちます。　おかあさんは　お料理の最中で　手が離せませんでしたが、　身に着けていたものは　どうしたのかしらと　首を傾げました。　つい　この間も　上着と靴をなくしたっていうのに。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,544,544,544,544,False,6,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"ぺーじ　を　めくって",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,608,544,608,544,False,55,@</BlockInfo>
																														//@<EndOfBlock/>
		CRobotUtil.wait((int)2000);																						//@<BlockInfo>jp.vstone.block.wait,672,544,672,544,False,5,コメント@</BlockInfo>	@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"なんと言ったら　いいのか、　ピーターは　その日の晩は　ずっと　具合が良くありませんでした。　お母さんは　ベッドに　寝かしつけ　カモミールのお茶を作ってあげました。　ピーターへのお薬と　いうわけです！「寝る前に　大匙一杯飲むこと。」",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,224,624,224,624,False,4,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"かたや　フロプシーと　モプシーと　カトンテルは　晩御飯に　パンと　牛乳と　クロイチゴを食べました。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,288,624,288,624,False,3,@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>

	}																													//@<EndOfBlock/>

}
