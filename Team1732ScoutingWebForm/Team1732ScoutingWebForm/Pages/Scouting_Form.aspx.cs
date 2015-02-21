using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Team1732ScoutingWebForm
{
    enum bool Auto_Info
    {
        bool tote_set { get; set;}
        
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
