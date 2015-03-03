using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Team1732ScoutingWebForm
{
<<<<<<< HEAD
    enum Stack_Locations
    {
        TT1 = 0,
        TT2 = 1,
        TT3 = 2,
        TT4 = 3,
        TT5 = 4,
        Bin = 5,
        Noodle = 6
    }
=======
    //enum Auto_Info
    //{
    //    tote_set { get; set;}
        
    //}
>>>>>>> origin/master

    struct Auto_Info
    {
        bool tote_set { get; set;}
        bool tote_stack { get; set; }
        bool robot_set { get; set; }
        bool mobility { get; set; }        
    }

    struct Coop_Info
    {
        bool stack_success { get; set; }
        bool stack_attempt { get; set; }
        bool set_success { get; set; }
        bool set_attempt { get; set; }
    }

    public partial class _Default : System.Web.UI.Page
    {
        protected void enableMoarStacks_CheckedChanged(object sender, EventArgs e)
        {
            if (!toteStacksSixPlus.Visible)
                toteStacksSixPlus.Visible = true;
        }

        protected void btn_Submit_Click(object sender, EventArgs e)
        {

        }
    }
}
