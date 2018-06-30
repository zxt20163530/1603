#include<iostream>
#include<string>
using namespace std;

#define HASH_LENGTH 50                      
#define M 47                      
#define NAME_NO 30           

typedef struct      
{   char *py;  
    int k;      
}NAME;

NAME NameList[HASH_LENGTH];          

typedef struct   
{   char *py; 
    int k;      
    int si;     
}HASH;

HASH HashList[HASH_LENGTH];                            

void InitNameList()          
{   char *f;
    int r,s0,i;
for (i=0; i<HASH_LENGTH; i++)
{
  NameList[i].py = new char[64];
  NameList[i].py[0] = 0;
}
strcpy(NameList[0].py, "songjiang");
    strcpy(NameList[1].py, "lujunyi");
    strcpy(NameList[2].py, "wuyong");
    strcpy(NameList[3].py, "gongsunsheng");
    strcpy(NameList[4].py, "guansheng");
    strcpy(NameList[5].py, "linchong");
    strcpy(NameList[6].py, "qinming");
    strcpy(NameList[7].py, "huyanzhuo");
    strcpy(NameList[8].py, "huarong");
    strcpy(NameList[9].py, "chaijin");
    strcpy(NameList[10].py, "liying");
    strcpy(NameList[11].py, "zhutong");
    strcpy(NameList[12].py, "luzhishen");
    strcpy(NameList[13].py, "wusong");
    strcpy(NameList[14].py, "dongping");
    strcpy(NameList[15].py, "zhangqing");
    strcpy(NameList[16].py, "yangzhi");
    strcpy(NameList[17].py, "xuning");
    strcpy(NameList[18].py, "suochao");
    strcpy(NameList[19].py, "daizong");
    strcpy(NameList[20].py, "liutang");
    strcpy(NameList[21].py, "likui"); 
    strcpy(NameList[22].py, "shijin");
    strcpy(NameList[23].py, "muhong");
    strcpy(NameList[24].py, "leiheng");
    strcpy(NameList[25].py, "lijun");
    strcpy(NameList[26].py, "ruanxiaoer");
    strcpy(NameList[27].py, "zhangheng");
    strcpy(NameList[28].py, "ruanixaowu");
    strcpy(NameList[29].py, "zhangshun");

    for(i=0;i<NAME_NO;i++)
{   
  s0=0;
  f=NameList[i].py;
  for(r=0;*(f+r)!='\0';r++) 
  /* ���������ַ����ĸ����ַ�����Ӧ��ASCII����ӣ����õ�������Ϊ��ϣ��Ĺؼ���*/
   s0=*(f+r)+s0;
  NameList[i].k=s0;
} 
}
void CreateHashList() //������ϣ��   
{ 
int i;
for(i=0; i<HASH_LENGTH;i++) 
{   
  HashList[i].py=new char[64];
  HashList[i].py[0] = 0; 
  HashList[i].k=0;
  HashList[i].si=0;
}
for(i=0;i<HASH_LENGTH;i++)
{
  int sum=0;
  int adr=(NameList[i].k)%M;  
  int d=adr;
  if(HashList[adr].si==0)     //�������ͻ
  {
   HashList[adr].k=NameList[i].k;
   HashList[adr].py=NameList[i].py;
   HashList[adr].si=1;
  }
  else   //��ͻ 
  { 
   while (HashList[d].k!=0)
   {
    d=(d+NameList[i].k%10+1)%M;     
    sum=sum+1;                   
   };
   HashList[d].k=NameList[i].k;
   HashList[d].py=NameList[i].py;
   HashList[d].si=sum+1;
  }
}
}
void FindList() //����    
{ 
    char name[30]={0};
    int s0=0,r,sum=1,adr,d;
    cout<<"������������ƴ��:"<<endl;     
    cin>>name;
    for(r=0;r<30;r++)   
        s0+=name[r]; 
    adr=s0%M;   
    d=adr;
    if(HashList[adr].k==s0)       
  cout<<"����:"<<HashList[d].py<<" "<<"�ؼ���:"<<s0<<" "<<"���ҳ���Ϊ: 1"<<endl; 
    else if (HashList[adr].k==0) 
  cout<<"�޴˼�¼!"<<endl;
    else
{   
  int g=0;
  while(g==0)
  {
   d=(d+s0%10+1)%M;       //α���̽����ɢ�з������ͻ                     
   sum=sum+1;
   if(HashList[d].k==0)
   {
    cout<<"�޴˼�¼!"<<endl; 
    g=1;     
   }
   if(HashList[d].k==s0)
   {
    cout<<"����:"<<HashList[d].py<<" "<<"�ؼ���:"<<s0<<" "<<"���ҳ���Ϊ:"<<sum<<endl;
    g=1; 
   }
    };   
} 
}
void   Display() // ��ʾ��ϣ��       
{ 
int i;
    float average=0;
     
cout<<"\n��ַ\t�ؼ���\t\t��������\tH(key)\t ����\n"; //��ʾ�ĸ�ʽ
    for(i=0; i<50; i++)
{   
  cout<<i<<" "; 
        cout<<"\t"<<HashList[i].k<<" ";
        cout<<"\t\t"<<HashList[i].si<<" ";
        cout<<"\t\t"<<(HashList[i].k%M)<<" ";
        cout<<"\t "<<HashList[i].py<<" ";
        cout<<"\n";
}
    for(i=0;i<HASH_LENGTH;i++)
        average+=HashList[i].si; 
    average/=NAME_NO;
cout<<"ƽ�����ҳ��ȣ�ASL("<<NAME_NO<<")="<<average<<endl;


}
int main()
{
char x;
InitNameList();                                
CreateHashList (); 
cout<<"1. ��ʾ��ϣ�� 2. �������� "<<endl;
while(cin>>x)
{
  if(x=='1')
  {
   Display();
   cout<<endl;
  }
  else if(x=='2')
  {
   FindList();
   cout<<endl;
  }
  else break;
}
for (int i=0; i<HASH_LENGTH; i++)
{
  free(NameList[i].py);
  free(HashList[i].py);
}
return 0;
}
