//このソースは、VstoneMagicによって自動生成されました。
//ソースの内容を書き換えた場合、VstoneMagicで開けなくなる場合があります。
package	jp.co.mysota;
import	main.main.GlobalVariable;
import	jp.vstone.RobotLib.*;
import	jp.vstone.sotatalk.*;
import	java.awt.Color;
import	jp.vstone.sotatalk.SpeechRecog.*;

public class mgirl
{

	public CRobotPose pose;
	public mgirl()																										//@<BlockInfo>jp.vstone.block.func.constructor,16,16,144,16,False,2,@</BlockInfo>
	{
																														//@<OutputChild>
		/*CRobotPose pose*/;																							//@<BlockInfo>jp.vstone.block.variable,80,16,80,16,False,1,break@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>
	}																													//@<EndOfBlock/>

	//@<Separate/>
	public void talk()																									//@<BlockInfo>jp.vstone.block.func,48,176,672,624,False,24,@</BlockInfo>
	throws SpeechRecogAbortException {
		if(!GlobalVariable.TRUE) throw new SpeechRecogAbortException("default");

																														//@<OutputChild>
		GlobalVariable.sotawish.Say((String)"青空文庫　マッチ売りの少女　を読みます．",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,176,176,176,176,False,23,@</BlockInfo>
																														//@<EndOfBlock/>
		pose = new CRobotPose();																						//@<BlockInfo>jp.vstone.block.pose,240,176,240,176,False,22,コメント@</BlockInfo>
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
		GlobalVariable.sotawish.Say((String)"それは、ひどく寒い大晦日のことでした。あたりはもう真っ暗で、こんこんと雪が降っていました。寒い夜の中、みすぼらしい一人の少女が歩いていました。ぼうしもかぶらず、はだしでしたが、どこへ行くというわけでもありません。行くあてがないのです。ほんとうは家を出るときに　いっそく　の木ぐつをはいていました。でも、サイズが大きくぶかぶかで、役に立ちませんでした。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,400,176,400,176,False,21,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"実はお母さんのものだったので無理もありません。道路をわたるときに、二台の馬車がとんでもない速さで走ってきたのです。少女は馬車をよけようとして、木ぐつをなくしてしまいました。木ぐつの片方は見つかりませんでした。もう片方は若者がすばやくひろって、「子供ができたときに、ゆりかごの代わりになる。」と言って、持ちさってしまいました。だから少女はその小さなあんよに何もはかないままでした。あんよは寒さのために赤くはれて、青じんでいます。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,464,176,464,176,False,20,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"少女の古びたエプロンの中にはたくさんのマッチが入っています。手の中にも一箱持っていました。一日中売り歩いても、買ってくれる人も、一枚の銅貨すらくれる人もいませんでした。少女はおなかがへりました。寒さにぶるぶるふるえながらゆっくり歩いていました。それはみすぼらしいと言うよりも、あわれでした。少女の肩でカールしている長い金色のかみの毛に、雪のかけらがぴゅうぴゅうと降りかかっていました。でも、少女はそんなことに気付いていませんでした。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,528,176,528,176,False,19,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"これで第一部は終わり，次は第二部です．",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,176,288,176,288,False,18,@</BlockInfo>
																														//@<EndOfBlock/>
		pose = new CRobotPose();																						//@<BlockInfo>jp.vstone.block.pose,240,288,240,288,False,17,コメント@</BlockInfo>
		pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
						new Short[]{0,-900,0,900,0,0,0,0}
						);
		pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
						new Short[]{100,100,100,100,100,100,100,100}
						);
		pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
						new Short[]{0,-255,0,180,80,0,180,80,0}
						);
		GlobalVariable.motion.play(pose,2600);
		CRobotUtil.wait(2600);																							//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"どの家の窓も明かりがあかあかとついていて、おなかがグゥとなりそうなガチョウの丸焼きのにおいがします。そっか、きょうは　大晦日なんだ、と少女は思いました。一つの家がとなりの家よりも通りに出ていて、影になっている場所がありました。地べたに少女はぐったりと座りこんで、身をちぢめて丸くなりました。小さなあんよをぎゅっと引きよせましたが、寒さをしのぐことはできません。少女には、家に帰る勇気はありませんでした。なぜなら、マッチが一箱も売れていないので、一枚の銅貨さえ家に持ち帰ることができないのですから。するとお父さんはぜったいほっぺをぶつにちがいありません。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,400,288,400,288,False,16,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"ここも家も寒いのには変わりないのです、あそこは屋根があるだけ。その屋根だって、大きな穴があいていて、すきま風をわらとぼろ布でふさいであるだけ。小さな少女の手は今にもこごえそうでした。そうです！　マッチの火が役に立つかもしれません。マッチを箱から取り出して、カベでこすれば手があたたまるかもしれません。少女は一本マッチを取り出して――「シュッ！」と、こすると、マッチがメラメラもえだしました！　",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,464,288,464,288,False,15,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"あたたかくて、明るくて、小さなロウソクみたいに少女の手の中でもえるのです。本当にふしぎな火でした。まるで、大きな鉄のだるまストーブの前にいるみたいでした、いえ、本当にいたのです。目の前にはぴかぴかの金属《きんぞく》の足とふたのついた、だるまストーブがあるのです。とてもあたたかい火がすぐ近くにあるのです。少女はもっとあたたまろうと、だるまストーブの方へ足をのばしました。と、そのとき！　マッチの火は消えて、だるまストーブもパッとなくなってしまい、手の中に残ったのはマッチのもえかすだけでした。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,528,288,528,288,False,14,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"これで第二部は終わり，次は第三部です．",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,176,400,176,400,False,13,@</BlockInfo>
																														//@<EndOfBlock/>
		pose = new CRobotPose();																						//@<BlockInfo>jp.vstone.block.pose,240,400,240,400,False,12,コメント@</BlockInfo>
		pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
						new Short[]{0,-900,0,900,0,0,0,0}
						);
		pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
						new Short[]{100,100,100,100,100,100,100,100}
						);
		pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
						new Short[]{0,-255,0,180,80,0,180,80,0}
						);
		GlobalVariable.motion.play(pose,2600);
		CRobotUtil.wait(2600);																							//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"少女はべつのマッチを壁でこすりました。すると、火は勢いよく燃え出しました。光が　とても眩しくて、壁が　ヴェール　のようにすき通ったかと思うと、いつのまにか　部屋　の中にいました。テーブルには雪のように白いテーブルクロスがかかっていて、上に豪華な銀食器、ガチョウの丸焼きがのっていました。ガチョウの丸焼きにはリンゴと　乾燥桃　の詰め物がしてあって、湯気が立っていてとてもおいしそうでした。しかし、ふしぎなことにそのガチョウが胸にナイフとフォークがささったまま、お皿から飛びおりて、ゆかをよちよち歩き出し、少女の方へ向かってきました。そのとき、またマッチが消えてしまいました。よく見ると少女の前には、冷たくしめったぶ厚い壁しかありませんでした。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,400,400,400,400,False,11,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"これで第三部は終わり，次は第四部です．",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,176,512,176,512,False,10,@</BlockInfo>
																														//@<EndOfBlock/>
		pose = new CRobotPose();																						//@<BlockInfo>jp.vstone.block.pose,240,512,240,512,False,9,コメント@</BlockInfo>
		pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
						new Short[]{0,-900,0,900,0,0,0,0}
						);
		pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
						new Short[]{100,100,100,100,100,100,100,100}
						);
		pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
						new Short[]{0,-255,0,180,80,0,180,80,0}
						);
		GlobalVariable.motion.play(pose,2600);
		CRobotUtil.wait(2600);																							//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"少女はもう一つマッチを擦ると、今度は　あっという間　もありませんでした。少女はきれいなクリスマスツリーの下に座っていたのです。ツリーはとても大きく、綺麗に飾られていました。それは、少女がガラス戸ごしに見てきた、どんなお金持ちの家のツリーよりも綺麗で豪華でした。ショーウィンドウの中にある鮮やかな絵みたいに、ツリーのまわりの何千本もの細長いロウソクが、少女の頭の上できらきらしていました。少女が手をのばそうとすると、マッチはふっと消えてしまいました。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,400,512,400,512,False,8,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"たくさんあったクリスマスのロウソクはみんな、ぐんぐん空にのぼっていって、夜空にちりばめた星たちと見分けがつかなくなってしまいました。そのとき少女は　ひとすじ　の流れ星を見つけました。すぅっと黄色い線をえがいています。「だれかが死ぬんだ……」と、少女は思いました。なぜなら、おばあさんが流れ星を見るといつもこう言ったからです。人が死ぬと、流れ星が落ちて命が神さまのところへ行く、と言っていました。でも、そのなつかしいおばあさんはもういません。少女を愛してくれたたった一人の人はもう死んでいないのです。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,464,512,464,512,False,7,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"少女はもう一度マッチを擦りました。少女のまわりを光がつつみこんでいきます。前を見ると、光の中におばあさんが立っていました。明るくて、本当にそこにいるみたいでした。むかしと同じように、おばあさんは穏やかに優しく笑っていました。「おばあちゃん！」と、少女は大声を上げました。「ねぇ、私を一緒に連れてってくれるの？　でも……マッチが燃え尽きたら、おばあちゃんもどこかへ行っちゃうんでしょ。あったかいストーブや、ガチョウの丸焼き、大きくてきれいなクリスマスツリーみたいに、パッと消えちゃうんでしょ……」少女はマッチの束を全部だして、残らずマッチに火をつけました。そうしないとおばあさんが消えてしまうからです。マッチの光は真昼の太陽よりも明るくなりました。赤々ともえました。明るくなっても、おばあさんはいつもと同じでした。昔みたいに少女をうでの中に抱きしめました。そして二人はふわっとうかび上がって、空の向こうの、ずっと遠いところにある光の中の方へ、高く高くのぼっていきました。そこには寒さも　腹ペコ　も　痛み　もありません。なぜなら、神さまがいるのですから。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,528,512,528,512,False,6,@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"これで第四部は終わり，次は第五部です．",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,176,624,176,624,False,5,@</BlockInfo>
																														//@<EndOfBlock/>
		pose = new CRobotPose();																						//@<BlockInfo>jp.vstone.block.pose,240,624,240,624,False,4,コメント@</BlockInfo>
		pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
						new Short[]{0,-900,0,900,0,0,0,0}
						);
		pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
						new Short[]{100,100,100,100,100,100,100,100}
						);
		pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
						new Short[]{0,-255,0,180,80,0,180,80,0}
						);
		GlobalVariable.motion.play(pose,2500);
		CRobotUtil.wait(2500);																							//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"朝になると、みすぼらしい服を着た少女が壁によりかかって、動かなくなっていました。ほほは青ざめていましたが、口もとは笑っていました。大晦日の日に、少女は寒さのため死んでしまったのです。今日は一月一日、一年の一番初めの太陽が、一体の　小さな　亡骸　を照らしていました。少女は座ったまま、死んでかたくなっていて、その手の中に、マッチのもえかすの束がにぎりしめられていました。「この子は自分をあたためようとしたんだ……」と、人々は言いました。でも、少女がマッチでふしぎできれいなものを見たことも、おばあさんといっしょに新しい年をお祝いしに行ったことも、だれも知らないのです。だれも……　また、新しい一年が始まりました。",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,400,624,400,624,False,3,@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>

	}																													//@<EndOfBlock/>

}
