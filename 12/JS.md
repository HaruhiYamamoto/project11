let 変数

const 定数

変数＝中の値変えられる
定数＝中の値変えられない


JSはデータに型がついている

myName  文字列型（String）
num　数値型  (number）
dec　浮動小数点型　　（number）

typeof で型が分かる

文字列型に数時型を入れることはできる（動的型なので）しかし推奨しない


let BMI =60 /(1.7*1.7);

console.log(`BMIは${BMI}です。`);
ーーーーーーーーーーーーーーーーーーーーーーーーーーーー
let mas = 60;

let height = 1.7;

let BMI2 = mas / (height * height);

console.log(`BMIは${BMI2}です。`);

上と下はどっちでもいい

条件分離
if (条件式) {
	trueの時実行
}　else{
	falseの時実行
}

　・>=以上
　・<=以下
　・>よりおおきい
　・< 未満
　・== 等しい
　・!= 等しくない

if (条件式) {
	trueの時実行したい処理
} else if(条件式２){
	条件式２がtrueの場合に実行したい処理
}　else{
	すべての条件式が成り立たない場合に実行したい処理
}

else if は何個でも
else は省略できる

型変換
let birthday = '2000';
let age = 24;
console.log(birthday + age);

結果　200024になる　　（ただの文字列結合）

文字列 + 数値 = 文字列
数値   + 文字列 = 文字列
数値 + 　数値 = 数値
文字列 + 文字列 = 文字列

cosole.log(Numberなどで型変換できる

変換できないときは　NaNになる

boolean

true　 false　はいか、いいえ

== と ===　の違い

==　は型が違うも中身が一緒だったら　true

＝＝＝　は型も同じじゃないと　trueにならない

論理演算

＆＆ 
両方ともtrueの場合にtrueになる

｜｜　
どちらかがtrueの場合にtrueになる

！　
console.log(!true) と入力すると　falseになる

＆＆　｜｜
上の準で優先が高い
console.log(false && true || true) の場合は　trueになる

条件分岐の入れ子

if (num % 2 === 0) {

    if (num % 3 === 0) {

        console.log(`${num} は２の倍数かつ３の倍数`);

    }

}

このように入れ子できる

条件分岐switc 

switc () {
case 値１:
     条件式　＝＝＝　１　である時に実行したい処理
break;
case　値２:
	 条件式　＝＝＝　２　である時に実行したい処理
break;
default:
	　条件式の値がすべてに合致しないときに実行したい処理
break;
}

ーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーー

let num =1;
switch (num) {

    case 1:

        console.log('金賞');

        break;

    case 2:

        console.log('銀賞');

        break;

    case 3:

        console.log('銅賞');

        break;

    case 4:

        console.log('参加賞');

        break;

    case 5:

        console.log('参加賞');

        break;

    default:

        console.log('入賞ならず');  

        break;

}

この場合は金賞

breakは必ず書く

ーーーーーーーーーーーーーーーーーーー

null undefindeの違い

undefindeは未定義

null定義されているが該当の回答がない

ーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーー
三項演算子

条件式　？　trueの場合　:　falseの場合

let age = 20;


let bevarage = age >= 20 ? 'ビール' : 'ジュース';
console.log(bevarage);

こんな感じに使える
基本的にIF文を使う。三項演算子はほぼ使わない

ーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーー

関数

・タスクび値や計算を実行する処理の集まり
・与えられた入力値に基づいて何らかの処理を行う
結果を返すことも出来る

４種類び関数の定義方法
・function命令
・関数リテラル
・functionコンストラクタ
・アロー関数

function命令

funcyton 関数名　（引数１、２）{
任意の処理
return
}

function rectangle(width, height) {

    return width * height;

}
console.log(rectangle(3, 5));

関数リテラル

funtion（引数１、引数２）{
 実行する処理;
}

const ractangle =function(heght, width ) {

    return heght * width;

}
console.log(ractangle(10, 5));


functionコンストラクタ

	new Fuction　（引数１、引数２　,関数本体の処理)


const rectangle

= new Function ('height', 'width','return height * width');

  

console.log(rectangle(10,5)); //50

functionコンストラクタはあんまり使わない


アロー関数

（引数, ） => {
	実行する処理
};


const rectangle = function(height, width) {

    return height * width;

}
console.log(rectangle(10, 5));

ーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーー

const rectangle2 = (height, width) => {

    return height * width;

}
	console.log(rectangle2(10, 5));
上が関数型リテラル
下がアロー関数
functionをはしょれる

コールバック関数
００が完了したら、△△を実行する


配列

let corlor = ["red", "blue", "green", "yellow", "pink"];

０１２３

0からスタート

上のように書く

データ型はバラバラでも問題ないが実務ではほぼ統一してつかうことが推奨

個数は変数名のあとに         .length

最後に挿入
corlor.push("black");

最初に挿入
corlor.unshift("white");

指定の位置に挿入
corlor[2] = "purple";

指定した位置に１以上の値を挿入

let insertArry = ["orange", "gray", "brown"];

insertArry.splice(1, 0, "silver", "gold");

（）の最初に挿入したいところ、上では１番目そして負の値、０でいい。そして挿入したい値、上ではbrown
複数挿入したい場合はbrownのあとに書いていく

console.log(insertArry);

削除
insertArry.splice(2, 2,)

２から２こ削除という意味

console.log(insertArry);

結合

let fruits = ["apple", "banana", "grape", "peach", "melon"];

let newFruits = ["doragon","kiwi"];

let allFruits = fruits.concat(newFruits);

furuitsにnewFruitsを結合してallFruitsに代入する

console.log(allFruits);

結合する処理だが元の変数は変わらない

先頭削除

shift

末尾を削除

pop

--------------------------------------------

getElementByIdで引数と同じ要素を取得できる。

let btn = document.getElementById("triggarButton");

btn.addEventListener("click", function(e){

 //   alert("ボタンがクリックされました");

  

 let headerTitle = document.getElementById("headerTitle");

 console.log(headerTitle);

 console.log(headerTitle.textContent);
HTML 側

    <button id="triggarButton">取得</button>

    <script src="./main.js"></script>
    にする
これで取得できる