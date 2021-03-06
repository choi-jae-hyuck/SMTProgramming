# SMTProgramming
===================================SMTP Rule=====================================
1. 처음시작시 kpu마크가 나오는 로딩화면을 띄운다.
1. 플레이어는 1스테이지마다 60~90초 동안 중앙의 기지를 향해 오는 적을 물리치는 2D 디펜스게임이다
2. 뷰는 3개로 스테이지화면, 플레이화면, 플레이어정보화면이 있다.
1. 스테이지화면은 스테이지의 제한시간, 클리어보상, 적의숫자를 표시하여 난이도를 대략적으로 알 수 있게한다.
4. 플레이화면은 사이드뷰로 중앙에 기지가 고정되어 있으며 맵 끝에서 적들이 중앙을 향해 몰려온다. 상단에 남은 제한시간을 표시하고 양끝에 앞의 적의 체력을 표시한다. 우상단에는 일시정지, 게임포기버튼을 추가한다
5. 플레이화면에서 스테이지를 클리어하면 다음스테이지, 플레이어정보로 넘어갈 수 있다.
6. 플레이어정보화면은 플레이어의 HP, 공격력, 스킬, 재화를 표시하고 재화를 소비하여 HP,스킬LV, 공격력을 강화할 수 있다.
7. 우하단에 스킬버튼을 표시하고 남은 쿨타임은 반투명 숫자를 표시한다.
8. 플레이어는 적을 처치할때마다 재화를 획득하며 스테이지 클리어시 고정재화를 획득한다.
9. 조작방법은 플레이어가 터치한 방향으로 인식하여 중앙오브젝트에서 공격하고 우하단의 스킬버튼을 터치하여 스킬을 사용한다.

===================================Play Preview====================================
![play](https://user-images.githubusercontent.com/43131738/80505117-e0f9bf00-89ae-11ea-9359-f1f5c37297b4.png)
1. 가운데의 구조물은 Player이며 하단에 HP를 표시한다.
2. player는 구조물을 기준으로 좌우를 터치하면 공격을 1회시작한다.
3. 우하단의 Skill을 터치하면 스킬을 사용한다.
4. 상단의 Timer에서 게임클리어까지 남은시간을 표시한다.
5. Timer좌우에는 Player에 제일 가까운 Enemy의 HP를 표시한다.
6. 우상단의 Play표시를 터치하면 게임을 Pause, Exit를 터치하면 Pause후 AlertDialog로 확인후에 스테이지화면으로 이동한다.
 
================================Player State Preview===============================
![state](https://user-images.githubusercontent.com/43131738/80506867-1dc6b580-89b1-11ea-8145-b3f3a13cbd33.png)
1. 우상단에 Money를 표시한다.
2. 우측의 LV버튼을 터치하면 재화를 사용하여 강화한다.
3. 슬라이드를 이용하여 Player의 state<->skill전환을 이루도록한다.
4. back키를 터치하면 Stage View로 이동한다.

1. 적 처치시에 1재화를 획득하고 스테이지 클리어시 30재화를 얻는다
1. 한번 강화시 무조건 10재화를 사용하게한다.
1. state강화는 Player의 HP+, 공격력+, 사정거리+가 있다. // Player의 기본사정거리는 -0.75~0.25이다. 만렙시 -1.0~1.0로 한다.
1. skill강화는 공격력+, 쿨타임시간-1초 가 있다.
 
==================================Planning========================================

1. 게임플레이에 필요한 Sprite를 생성하여 준비한다.
2. Player의 정보를 저장할 StateFile을 생성한다.
3. Play View를 생성하여 게임플레이에 필요한 player-> enemy -> bullet -> timer -> hp표시 -> pause를 제작한다.
4. StateFile을 연동할 PlayerState View를 제작.
5. 스테이지를 표시할 Stage View를 제작한다.
6. Play View에 skill을 제작한다.
7. Play View,PlayerState View, Stage View를 연결한다. ( Play <-> Stage <-> PlayerState )
8. (추가사항) enemy의 종류를 추가한다.

#### class
player - hp, fire_speed, bitmap    
bullet - demage, reach, bitmap    
enemy - hp, attack, move_speed, bitmap    
enemyGenerator - time, interval, level    
timer - time, bitmap    
money - money, bitmap     
skill - timer, bitmap    
console - pause(), exit()    

==================================3 Week Planning===================================
### 1주차 (6.1 ~ 6.7)
1. 게임플레이 player,enemy,bullet,timer,money 생성 //Default로 생성하여 테스트 (~6.3)
1. player-hp, enemy-hp표시 생성, 로딩화면 생성 및 연결 (~6.5)
1. console에 AlertDialog표시하여 일단 게임종료 및 1주차 정리 (~6.7)

### 2주차 (6.8 ~ 6.14)
1. player의 StateFile생성 및 PlayerState View에 연결 후 재화 소모하여 능력치 + 테스트 (~6.10)
1. StageView를 제작하여 easy,normal,hard표시후 exit을 Stage<->Play로 연동 (~6.12)
1. Stage<->PlayerState연결 및 2주차 정리 (~6.14)


### 3주차 (6.15 ~ 6.21)
1. Skill 추가하여 테스트 (~6.19)
1. PlayerState View에 skill항목 추가 후 StateFile에 연결 (~6.20)
1. 버그수정 및 최후확인 (~6.21)


